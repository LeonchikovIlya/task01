package mycollections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedQueueTest {

    private static MyLinkedQueue<Integer> emptyList = new MyLinkedQueue<>();
    private static MyLinkedQueue<Integer> list;

    @Before
    public void init() {
        list = new MyLinkedQueue<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void poll() {
        assertEquals((Integer) 40, list.poll());
        assertFalse(list.contains(40));
    }

    @Test(expected = IllegalArgumentException.class)
    public void pollEmptyQueue() {
        emptyList.poll();
    }

    @Test
    public void peek() {
        assertEquals((Integer) 40, list.peek());
        assertTrue(list.contains(40));
    }

    @Test(expected = IllegalArgumentException.class)
    public void peekEmptyQueue() {
        emptyList.peek();
    }
}