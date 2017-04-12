package le;

import java.util.LinkedList;

/**
 * this is the STACK
 * 
 * @author Phuc Hong Le
 */
public class LinkedStack<E> implements Stack<E> {

    private LinkedList<E> list = new LinkedList<>();
    
    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.pollFirst();
    }

    @Override
    public E peek() {
        return list.peekFirst();
    }

    @Override
    public boolean isEmpy() {
        return list.isEmpty();
    }
    
}
