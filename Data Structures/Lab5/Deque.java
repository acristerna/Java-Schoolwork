import java.util.*;

public class Deque<E> extends LinkedList<E> {

    public void addTail(E e){
       addLast(e);
    }
    public E deleteTail(){
         if (!isEmpty())
        return removeLast();
           else {
        System.out.println("queue is empty....");
            return null;
        }
    }
    public void addHead(E e)
    {
        addFirst(e);
    }
    
    public E deleteHead()
    {
         if (!isEmpty())
        return removeFirst();
         else {
        System.out.println("queue is empty....");
            return null;
    }

    }
}