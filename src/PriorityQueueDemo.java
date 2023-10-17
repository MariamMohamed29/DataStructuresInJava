import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static void IteratePriorityQueue(PriorityQueue<String> priorityQueue){
        priorityQueue.add("mariam");
        priorityQueue.add("mohamed");
        priorityQueue.add("mona");
        Iterator iterator=priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        //adding elements to priorityQueue
        priorityQueue.add(1);
        priorityQueue.add(12);
        priorityQueue.add(20);
        //printing the top element of the priorityQueue
        System.out.println(priorityQueue.peek());
        //removing the top element of the priorityQueue
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        //removing a specific element from the priorityQueue
        priorityQueue.remove(20);
        System.out.println(priorityQueue);
        //Iterate elements in priorityQueue
        PriorityQueue<String> priorityQueue2=new PriorityQueue<>();
        IteratePriorityQueue(priorityQueue2);

    }
}
