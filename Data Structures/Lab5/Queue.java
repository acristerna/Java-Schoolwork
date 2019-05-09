import java.util.*;

public class Queue<E> extends LinkedList<E>
{
 
    // add at at the tail of the queue 
    // first is the tail
    public void enqueue(E e) {
        addFirst(e);
        
}
    // delete at the head of the queue and return value deleted
    // last is the head
    public E deque() {
        if (!isEmpty())
        
        return removeLast();
        
        else {
        System.out.println("queue is empty....");
            return null;
    }
}

}