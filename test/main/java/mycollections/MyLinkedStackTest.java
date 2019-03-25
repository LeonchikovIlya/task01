package mycollections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedStackTest {

    private static MyLinkedStack<Integer> emptyList = new MyLinkedStack<>();
    private static MyLinkedStack<Integer> list;

    @Before
    public void init() {
        list = new MyLinkedStack<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void pop() {
        assertEquals((Integer) 55,list.pop());
        assertFalse(list.contains(55));
    }

    @Test(expected = IllegalArgumentException.class)
    public void popEmptyLinked() {
        emptyList.pop();
    }

    @Test
    public void peek() {
        assertEquals((Integer) 55,list.peek());
        assertTrue(list.contains(55));
    }

    @Test(expected = IllegalArgumentException.class)
    public void peekEmptyLinked() {
        emptyList.peek();
    }

    @Test
    public void push() {
        list.push(300);
        assertTrue(list.contains(300));
    }

    @Test
    public void pushByNull() {
        list.push(null);
        assertFalse(list.contains(null));
    }
}