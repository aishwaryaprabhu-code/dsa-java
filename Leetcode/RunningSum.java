class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }

        return result;
    }
}

// time complexity O(n)
//space complexity O(n)// as extra array(result) is used 
