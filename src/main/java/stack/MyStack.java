package stack;

import java.util.EmptyStackException;

public class MyStack<T> implements IStack<T> {

    private int size;
    private Node head;

    public MyStack() {
        this.size = size();
        this.head = new Node(null);
    }

    @Override
    public void push(T data) {
        Node node = new Node(data, this.head.next);
        this.head.next = node;
        this.size++;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException(); //빈 스텍 에러처리
        }
        Node curr = this.head.next;
        this.head.next = curr.next;
        curr.next = null;
        this.size--;
        return curr.data;

    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.head.next.data;
    }

    private boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
