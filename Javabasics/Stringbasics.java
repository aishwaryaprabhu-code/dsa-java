class StringBasics{
  public static void main(string[] args){
    string s = "madam";

    System.out.println(s.length());
    System.out.println(s.charAt(0));

  for(int i=0; i < s.length();i++){
    System.out.println(i + " " +s.charAt(i));
    }
    System.out.println(s.charAt(s.length()-1));
  }
}


// output for madam
5
m
0 m
1 a
2 d
3 a
4 m
m
