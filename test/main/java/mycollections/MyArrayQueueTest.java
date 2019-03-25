package mycollections;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayQueueTest {

    private static MyArrayQueue<Integer> emptyList = new MyArrayQueue<>();
    private static MyArrayQueue<Integer> list;

    @Before
    public void init() {
        list = new MyArrayQueue<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void poll() {
        assertEquals(list.array[0],list.poll());
        assertFalse(list.contains(40));
    }

    @Test (expected = IllegalArgumentException.class)
    public void pollEmptyQueue() {
        emptyList.poll();
    }

    @Test
    public void peek() {
        assertEquals(list.array[0],list.peek());
        assertTrue(list.contains(40));
    }

    @Test (expected = IllegalArgumentException.class)
    public void peekEmptyQueue() {
        emptyList.peek();
    }
}