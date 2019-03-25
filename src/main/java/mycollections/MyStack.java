package mycollections;


/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public interface MyStack<E> extends MyCollection<E> {

    E pop();

    E peek();

    boolean push(E element);

}
