class Solution{
  public int fib(int n ){
    if(n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    return fib(n -1) + fib(n  - 2);
  }
}

/// time complexity 
O(2^n) - each call creates 2 more recursive call
  // space complexity
O(n) - max depth of recursion stack is n
