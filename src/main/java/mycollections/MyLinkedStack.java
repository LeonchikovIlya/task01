package mycollections;

import java.util.NoSuchElementException;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyLinkedStack<E> extends MyLinkedList<E> implements MyStack<E> {

    public MyLinkedStack() {
    }

    @Override
    public E pop() {
        return removeLast();
    }

    @Override
    public E peek() {
        return getLast();
    }

    @Override
    public boolean push(E element) {
        add(element);
        return true;
    }
}
