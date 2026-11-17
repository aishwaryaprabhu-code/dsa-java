class StringBasics_2 {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(s.length());
        System.out.println(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + " " + s.charAt(i));
        }

        System.out.println(s.charAt(s.length() - 1));
    }
}

// output
5
h
0 h
1 e
2 l
3 l
4 l
5 o
0
// not a palindrome
