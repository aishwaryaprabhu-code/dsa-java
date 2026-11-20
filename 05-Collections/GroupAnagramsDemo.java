import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.uitl.List;

class GroupAnagramsDemo{
  public static void main(String[] args){
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

       HashMap<String, List<String>> map = new HashMap<>();
        for(String word : words){
          char[] letter = word.toCharArray();
          Array.sort(letters);
          String key = new String(letters);

          if(!map.containsKey(key)){
             map.put(key, new ArrayList<>());// new ArrayList<>() creates empt list for a new label
          }
          map.get(key).add(word);//gets he list stored under key, then add the word to it

          System.out.println(word + "->" + map);

        }
    System.out.println(new ArrayList<>(map.values()));// map.value gives all the list
  }
}
