import java.util.ArrayList;
import java.util.HashSet;

class CollectionsPractice {
  public static void main(String[] args){
    ArrayList<Integer> listt = new ArrayList<>();
    list.add(5);
    list.add(6);
    list.add(5);
    list.add(6);
    list.add(3);

System.out.println(list);
System.out.println(list.size());
System.out.println(list.get(0));

  HashSet<Integer> set = new HashSet<>();
    set.add(5);
    set.add(6);
    set.add(5);
    set.add(6);
    set.add(3);

  System.out.println(set);
  System.out.println(set.size());
  System.out.println(set.contains(3));
  }
}

//output
[5,6,5,6,3]
5
5
[5,6,3]
3
true
--------------------------------------------------------------------------
  ArrayList- keeps the duplictae - slow scans whole list
  Hashset - removes the duplicate - fast 
