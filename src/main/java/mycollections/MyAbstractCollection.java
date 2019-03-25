package mycollections;

import java.util.Objects;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public abstract class MyAbstractCollection<E> implements MyCollection<E> {

    protected int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        MyAbstractCollection<?> that = (MyAbstractCollection<?>) o;
        return size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
