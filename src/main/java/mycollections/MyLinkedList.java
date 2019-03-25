package mycollections;


import java.util.Objects;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class MyLinkedList<E> extends MyAbstractCollection<E> {

    private Node<E> firstNode;

    private Node<E> lastNode;

    public MyLinkedList() {
    }

    @Override
    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean add(E e) {

        boolean result = false;

        if (e != null) {
            addLast(e);
            result = true;
        }
        return result;
    }

    @Override
    public boolean remove(E o) {

        boolean result = false;

        if (o == null) {
            for (Node<E> x = firstNode; x != null; x = x.next) {
                if (x.curr == null) {
                    removeElement(x);
                    result = true;
                }
            }
        } else {
            for (Node<E> x = firstNode; x != null; x = x.next) {
                if (o.equals(x.curr)) {
                    removeElement(x);
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public void clear() {

        for (Node<E> x = firstNode; x != null; ) {
            Node<E> next = x.next;
            x.curr = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        firstNode = lastNode = null;
        size = 0;
    }

    private int indexOf(Object o) {

        int index = 0;
        if (o == null) {
            for (Node<E> x = firstNode; x != null; x = x.next) {
                if (x.curr == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = firstNode; x != null; x = x.next) {
                if (o.equals(x.curr)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    private void removeElement(Node<E> o) {

        final E element = o.curr;
        final Node<E> next = o.next;
        final Node<E> prev = o.prev;

        if (prev == null) {
            firstNode = next;
        } else {
            prev.next = next;
            o.prev = null;
        }

        if (next == null) {
            lastNode = prev;
        } else {
            next.prev = prev;
            o.next = null;
        }

        o.curr = null;
        size--;
    }

    public void addLast(E e) {

        if (e != null) {
            final Node<E> l = lastNode;
            final Node<E> newNode = new Node<>(l, e, null);
            lastNode = newNode;
            if (l == null) {
                firstNode = newNode;
            } else {
                l.next = newNode;
            }
            size++;
        }
    }

    public void addFirst(E e) {

        if (e != null) {
            final Node<E> f = firstNode;
            final Node<E> newNode = new Node<>(null, e, f);
            firstNode = newNode;
            if (f == null) {
                lastNode = newNode;
            } else {
                f.prev = newNode;
            }
            size++;
        }
    }

    public E getFirst() {
        final Node<E> f = firstNode;
        if (f == null) {
            throw new IllegalArgumentException("Linked is empty");
        }
        return f.curr;
    }

    public E getLast() {
        final Node<E> l = lastNode;
        if (l == null) {
            throw new IllegalArgumentException("Linked is empty");
        }
        return l.curr;
    }

    public E removeFirst() {
        final Node<E> f = firstNode;
        if (f == null) {
            throw new IllegalArgumentException("Linked is empty");
        }
        return unlinkFirst(f);
    }

    public E removeLast() {
        final Node<E> l = lastNode;
        if (l == null) {
            throw new IllegalArgumentException("Linked is empty");
        }
        return unlinkLast(l);
    }

    private E unlinkFirst(Node<E> f) {

        final E element = f.curr;
        final Node<E> next = f.next;
        f.curr = null;
        f.next = null;
        firstNode = next;
        if (next == null) {
            lastNode = null;
        } else {
            next.prev = null;
        }
        size--;
        return element;
    }

    private E unlinkLast(Node<E> l) {

        final E element = l.curr;
        final Node<E> prev = l.prev;
        l.curr = null;
        l.prev = null;
        lastNode = prev;
        if (prev == null) {
            firstNode = null;
        } else {
            prev.next = null;
        }
        size--;
        return element;
    }

    private static class Node<E> {

        private Node<E> prev;
        private E curr;
        private Node<E> next;

        public Node(Node<E> prev, E curr, Node<E> next) {
            this.prev = prev;
            this.curr = curr;
            this.next = next;
        }

        public E getCurr() {
            return curr;
        }

        public void setCurr(E curr) {
            this.curr = curr;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return Objects.equals(firstNode, that.firstNode) &&
                Objects.equals(lastNode, that.lastNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstNode, lastNode);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (Node<E> x = firstNode; x != null; x = x.getNext()) {
            builder.append(x.getCurr()).append("\n");
        }

        return builder.toString();
    }
}
