package le;

/**
 * this is the STACK
 * 
 * @author Phuc Hong Le
 */
public interface Stack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpy();
}
