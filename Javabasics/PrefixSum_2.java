//with method
class PrefixSum_2 {
  
    public static int[] buildPrefix(int[] arr) {

        int[] prefix = new int[arr.length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            prefix[i] = sum;
        }

        return prefix;
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 4};

        
        int[] result = buildPrefix(arr);

        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

//output

5 6 8 12
