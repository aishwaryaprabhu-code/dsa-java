class RangeSum {

    public static int[] buildPrefix(int[] arr) {
        int[] prefix = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            prefix[i] = sum;
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        }
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int[] prefix = buildPrefix(arr);

        System.out.println(rangeSum(prefix, 1, 3));
        System.out.println(rangeSum(prefix, 0, 2));
        System.out.println(rangeSum(prefix, 2, 4));
    }
}

//output

7
8
11
