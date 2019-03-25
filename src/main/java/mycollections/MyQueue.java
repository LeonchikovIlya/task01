package mycollections;


/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public interface MyQueue<E> extends MyCollection<E>{

    E poll();

    E peek();
}
