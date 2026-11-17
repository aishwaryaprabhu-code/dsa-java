import java.uitl.ArrayDeque;
import java.util.Deque;

public class StackBasics{
  public static void main(String[] args){
     Deque<Integer> stack = new ArrayDeque<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
// output
3
3
2
false
5
true

here "ArrayDeque " - allows us to do implementation of stack
"deque" - interface -> allows us to do insertion and deletion from both ends and can be used in stacks
  
