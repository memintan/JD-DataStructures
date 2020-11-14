import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFromGeeks {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //Adds elements {0,1,2,3,4} to the queue

        for (int i=0; i<5;i++) q.add(i);

        //Display contents of the queue
        System.out.println("Elements of queue: "+q);

        //To remove the head of queue
        int remove = q.remove();
        System.out.println("Removed element is => "+remove);

        System.out.println("Queue after remove => "+q);

        //To view the head of queue
        int head = q.peek();
        System.out.println("head => " + head);

        //Rest all methods of collection interface like size and contains can be used with this implementation
        int size  = q.size();
        System.out.println("size of queue => " + size);

        q.add(null);

        Iterator it = q.iterator();
        while(it.hasNext()){
            System.out.println("it.next() => " + it.next());
        }

    }
}
