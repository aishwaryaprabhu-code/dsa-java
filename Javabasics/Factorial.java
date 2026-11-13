class Factorial {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
    }
}

// the values return from bottom up (stack)
//output:
 120
 24
// complexities
     time : O(n) - one recursive call for each value from n down to 1
     space: O(n) - due to recurson stack
