package mycollections;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAbstractCollectionTest {

    private static MyArrayList<Integer> list;

    @BeforeClass
    public static void init() {
        list = new MyArrayList<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void size() {
        assertEquals(2,list.size());
    }

    @Test
    public void isEmpty() {
        assertFalse(list.isEmpty());
    }
}