package queue;

public interface IQueue<T> {
    void offer(T data);
    T pool();
    T peek();
    int size();
    void clear();
    boolean isEmpty();
}
