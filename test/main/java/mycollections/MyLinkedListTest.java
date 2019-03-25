package mycollections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    private static MyLinkedList<Integer> emptyList = new MyLinkedList<>();
    private static MyLinkedList<Integer> list;

    @Before
    public void init() {
        list = new MyLinkedList<>();
        list.add(40);
        list.add(55);
        list.add(33);
    }

    @Test
    public void contains() {
        assertTrue(list.contains(55));
    }

    @Test
    public void add() {
        assertTrue(list.add(3));
    }

    @Test
    public void addByNull() {
        assertFalse(list.add(null));
    }

    @Test
    public void remove() {
        assertTrue(list.remove(40));
    }

    @Test
    public void removeIllegalElement() {
        assertFalse(list.remove(100));
    }

    @Test
    public void clear() {
        list.clear();
        assertEquals(emptyList,list);
    }

    @Test
    public void addLast() {
        list.addLast(100);
        assertEquals((Integer) 100,list.getLast());
    }

    @Test
    public void addFirst() {
        list.addFirst(120);
        assertEquals((Integer)120,list.getFirst());
    }

    @Test
    public void getFirst() {
        assertEquals((Integer)40,list.getFirst());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFirstEmptyLinked() {
        emptyList.getFirst();
    }

    @Test
    public void getLast() {
        assertEquals((Integer)33,list.getLast());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLastEmptyLinked() {
        emptyList.getLast();
    }

    @Test
    public void removeFirst() {
        list.removeFirst();
        assertEquals((Integer)55,list.getFirst());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeFirstEmptyLinked() {
        emptyList.removeFirst();
    }

    @Test
    public void removeLast() {
        list.removeLast();
        assertEquals((Integer)55,list.getLast());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeLastEmptyLinked() {
        emptyList.removeLast();
    }
}