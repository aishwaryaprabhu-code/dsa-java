class BinarySearch{
  public static int search(int[] nums, int targett){
    int left = 0;
    int right = nums.length - 1;

    while(left<=right){
      int mid = left + (right - left)/2;
      if(nums[mid] ==  target){
        return mid;
      }else if(nums[mid] < target){
              left = mid+1;
      }else{
              right = mid - 1;
      }
      
    }
      return -1;
    }
  public static void main(String[] args){
    int[] arr = {2,4,6,8,10,12,14,16};

    System.out.println(search(arr, 12));
    System.out.println(search(arr, 5));
  }
}

//output
5
-1 // here -1 cuz the target dosent exists 

    
