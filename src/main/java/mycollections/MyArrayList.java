package mycollections;


import java.util.Arrays;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyArrayList<E> extends MyAbstractCollection<E> {

    protected Object[] array;

    public MyArrayList() {
        this.array = new Object[size];
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    public MyArrayList(MyArrayList<E> list) {
        this.array = list.array;
    }


    @Override
    public boolean contains(E o) {

        boolean result = false;

        if (o != null) {
            for (Object s : array) {
                if (o.equals(s)) {
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public boolean add(E e) {

        boolean result = false;

        if (size < array.length) {
            array[size] = e;
            size++;
            result = true;
        } else {
            increaseArraySize();
            array[size] = e;
            size++;
            result = true;
        }
        return result;
    }

    private void increaseArraySize() {
        int oldCapacity = array.length;
        int capacity = oldCapacity + 1;
        array = Arrays.copyOf(array, capacity);
    }

    @Override
    public boolean remove(E o) {

        boolean result = false;

        if (o != null) {
            int j = 0;

            for (int i = 0; i < array.length; i++) {
                if (o.equals(array[i])) {
                    j = i;
                    removeByIndex(j);
                    reduceArraySize();
                    result = true;
                }
            }
        }
        return result;
    }

    private void reduceArraySize() {

        int oldCapacity = array.length;
        array = Arrays.copyOf(array, oldCapacity - 1);

    }

    private void removeByIndex(int index) {

        if (index >= 0 && index < size) {
            if (index != size - 1) {
                int lastIndexOf = 0;
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                    lastIndexOf = i + 1;
                }
                array[lastIndexOf] = null;
                size--;
            } else {
                array[index] = null;
                size--;
            }
        }
    }

    @Override
    public void clear() {

        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
        array = Arrays.copyOf(array,size);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyArrayList<?> that = (MyArrayList<?>) o;
        return super.equals(o) && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        for (Object arr : array) {
            str.append(arr).append("\n");
        }

        return "[" + str + "]";
    }
}
