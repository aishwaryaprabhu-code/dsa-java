import java.util.HashMap;
class FrequencyCount{
  public static void main(String[] args){
    int[] nums = { 1,2,1,3,1,2};
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int x : nums){
      if(map.containsKey(x)){
        map.put(x, map.get(x) + 1);
      }else{
        map.put(x,1);
      }
    }
    System.out.println(map);

  for(int key : map.keySet()){
    System.out.println(key + "appears" + map.get(key) + "times");
  }
 }
}

//output
{1=3, 2=2, 3=1}
  1 appears 3 times
  2 appears 2 times
  3 appears 1 times
