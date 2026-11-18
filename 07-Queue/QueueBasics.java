import java.util.ArrayDeque;
import java util.Queue;

class QueueBasics{
  public static void main(String[] args){
    Queue<Integer> queue = new ArrayDeque<>();

  queue.add(1);
  queue.add(3);
  queue.add(4);

    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll())
    System.out.println(queue.isEmpty());
    System.out.println(queue.poll());
    System.out.println(queue.isEmpty());
  }
}

//Output
1
1
2
false
3
true
  
  
