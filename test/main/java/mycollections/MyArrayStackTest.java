package mycollections;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayStackTest {

    private static MyArrayStack<Integer> emptyList = new MyArrayStack<>();
    private static MyArrayStack<Integer> list;

    @Before
    public void init() {
        list = new MyArrayStack<>();
        list.add(40);
        list.add(55);
    }

    @Test
    public void pop() {
        assertEquals(list.array[1],list.pop());
        assertFalse(list.contains(55));
    }

    @Test(expected = IllegalArgumentException.class)
    public void popEmptyArray() {
        emptyList.pop();
    }

    @Test
    public void peek() {
        assertEquals(list.array[1],list.peek());
        assertTrue(list.contains(55));
    }

    @Test(expected = IllegalArgumentException.class)
    public void peekEmptyArray() {
        emptyList.peek();
    }

    @Test
    public void push() {
        assertTrue(list.push(22));
        assertTrue(list.contains(22));
    }
}