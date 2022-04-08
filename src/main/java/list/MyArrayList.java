package list;

import java.util.Arrays;

import static javax.swing.GroupLayout.DEFAULT_SIZE;

public class MyArrayList<T> implements IList<T> {

    private int size;
    private T[] elements;

    public MyArrayList(){
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(T t) {
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[this.size] = t;
        this.size = this.size + 1;
    }

    @Override
    public void insert(int index, T t) {
        T temp;
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        for (int i = this.size - 1; index < i; i--){

            this.elements[i] = this.elements[i-1];
        }
        this.elements[index] = t;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];

    }

    @Override
    public boolean delete(T t) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                for (int j = i; j < this.size - 1; j++) {
                    this.elements[j] = this.elements[j + 1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index < 0 || index > this.size -1){
            return false;
        }

        for (int i = index; i < this.size; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > this.size -1) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    @Override
    public int indexOf(T t) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
