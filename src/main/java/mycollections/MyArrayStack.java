package mycollections;


import java.util.Arrays;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyArrayStack<E> extends MyArrayList<E> implements MyStack<E> {

    public MyArrayStack() {
    }

    public MyArrayStack(int capacity) {
        this.array = new Object[capacity];
    }


    @Override
    public E pop() {

        if (!isEmpty()) {
            E temp = (E) array[size - 1];
            remove(temp);
            array = Arrays.copyOf(array, size);
            return temp;
        }
        throw new IllegalArgumentException("Stack is empty");
    }

    @Override
    public E peek() {

        if (!isEmpty()) {
            return (E) array[array.length - 1];
        }
        throw new IllegalArgumentException("Stack is empty");

    }

    @Override
    public boolean push(E element) {
        add(element);
        return true;
    }

}
