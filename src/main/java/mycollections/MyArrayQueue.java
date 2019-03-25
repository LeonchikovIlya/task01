package mycollections;

import by.epam.javawebtraining.leonchikov.task01.model.logic.Finder;

import java.util.Arrays;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyArrayQueue<E> extends MyArrayList<E> implements MyQueue<E> {

    private final int FIRST_IN_ARRAY = 0;

    public MyArrayQueue() {
    }

    public MyArrayQueue(int capacity) {
        this.array = new Object[capacity];
    }

    @Override
    public E poll() {

        if (!isEmpty()) {
            if (array[FIRST_IN_ARRAY] != null) {
                E element = (E) array[FIRST_IN_ARRAY];
                remove(element);
                array = Arrays.copyOf(array, array.length - 1);
                return element;
            }
        }
        throw new IllegalArgumentException("Stack is empty");
    }

    @Override
    public E peek() {

        if (!isEmpty()) {
            return (E) array[FIRST_IN_ARRAY];
        }
        throw new IllegalArgumentException("Stack is empty");
    }
}
