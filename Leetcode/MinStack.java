import java.util.ArrayDeque;
import java.util.Deque;

class MinStack{
  private Deque<Integer> stack;
  Private Deque<Integer> minStack;

public MinStack(){
  stack = new ArrayDeque<>();
  minStack = new ArrayDeque<>();
}
public void push(int value){
  stack.push(value);
  if(minStack.isEmpty() ||value <= minStack.peek()){
    minStack.push(value);
  }
}

public void pop(){
  int removed = stack.pop();

  if(removed == minStack.pop()){
    minStack.pop();
  }
}
  public int top(){
    return stack.peek();
  }

public int getMin(){
  return minStack.peek();
}
}

///output

-3
0
-2
----------------------------------------------------------------------------------------------------

  with main!
import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

class Main {
    public static void main(String[] args) {
        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

// ccomplexities
Time: O(1) per method, Space: O(n).
  
  
