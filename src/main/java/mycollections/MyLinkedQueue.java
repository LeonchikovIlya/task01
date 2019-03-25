package mycollections;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyLinkedQueue<E> extends MyLinkedList<E> implements MyQueue<E> {

    public MyLinkedQueue() {
    }

    @Override
    public E poll() {
        return removeFirst();
    }

    @Override
    public E peek() {
        return getFirst();
    }
}
