import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> q=new ArrayDeque<String>();
        //1. adding elements
        q.add("one");
        q.addFirst("two");
        q.addLast("three");
        q.offer("four");
        q.offerFirst("five");
        q.offerLast("six");

        System.out.println(q);

        //2. iterating()

        for (Iterator itr=q.iterator();itr.hasNext();){
            System.out.println(itr.next()+" ");
        }
        //3.Accessing elements

        System.out.println("getFirst()"+"-"+q.getFirst());
        System.out.println("getLast()"+"-"+q.getLast());
        System.out.println("peek()"+"-"+q.peek());
        System.out.println("peekFirst()"+"-"+q.peekFirst());
        System.out.println("peekLast()"+"-"+q.peekLast());

        //4.Removing Elements

       System.out.println("remove()"+"-"+q.remove());
        System.out.println("removeFirst()"+"-"+q.removeFirst());
        System.out.println("removeLast()"+"-"+q.removeLast());
        System.out.println("poll()"+"-"+q.poll());
        System.out.println("pollLast()"+"-"+q.pollLast());
        System.out.println("pollFirst()"+"-"+q.pollFirst());
       // System.out.println("pop()"+"-"+q.pop());

        System.out.println(q);

    }
}
