//without method
class PrefixSum_1 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3};

        int[] prefix = new int[arr.length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            prefix[i] = sum;
        }

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}

//output
2 6 7 10
  
