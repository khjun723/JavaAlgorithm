package list;

public class MyDoubleLinkedList<T> implements  IList<T>{

    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList(){
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
    }

    @Override
    public void add(T t) {
        Node last = this.tail.prev;
        Node node = new Node(t, last, this.tail);
        last.next = node;
    }

    @Override
    public void insert(int index, Object o) {

    }

    @Override
    public void clear() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node prev;
        Node next;

        Node(T data) { this.data = data; }

        Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
