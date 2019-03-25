package mycollections;


/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public interface MyCollection<E> {

    int size();

    boolean isEmpty();

    boolean contains(E o);

    boolean add(E e);

    boolean remove(E o);

    void clear();

}
