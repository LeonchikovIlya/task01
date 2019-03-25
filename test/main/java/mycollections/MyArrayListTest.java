package mycollections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    private static MyArrayList<Integer> emptyList = new MyArrayList<>();
    private static MyArrayList<Integer> list;

    @Before
    public void init() {
        list = new MyArrayList<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void add() {
        assertTrue(list.add(10));
    }

    @Test
    public void contains() {
        assertTrue(list.contains(40));
    }

    @Test
    public void containsIllegalElement() {
        assertFalse(list.contains(66));
    }

    @Test
    public void remove() {
        assertTrue(list.remove(40));
    }

    @Test
    public void removeIllegalElement() {
        assertFalse(list.remove(20));
    }

    @Test
    public void clear() {
        list.clear();
        assertEquals(emptyList, list);
    }
}