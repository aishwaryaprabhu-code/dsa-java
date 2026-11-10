// leetcode 303
class NumArray{
  private int[] prefix;

public NumArray(int[] nums){
  prefix = new int[nums.length];
  int sum=0;

  for(int i=0;i<nums.length;i++){
    sum = sum + nums[i];
    prefix[i] = sum;
  }
}
puclic int sumRange(int left, int right){
  if(left == 0){
     return prefix[right];
  }
     return prefix[right] - prefix[left - 1];
  }
}
// this is only the solution block using oops without main

---------------------------------------------------------------------------------------------------
///leetcode  303 oops  
  class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            prefix[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}

class Main {
    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});

        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}

//output
1
-1
-3
  
  // this is with main and wih creation of the object.
  // leetcode accepted  both .
  // but most of the time its better for us to just wite the solution part and writ ethe main parrt for our references 
