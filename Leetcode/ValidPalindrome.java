public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) { //this stops left and right crossing each other
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) { //  this while loop skips if any space or symbol is present for left
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) { // /  this while loop skips if any space or symbol is present for right
            right--;
        }

        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { // this if block compares the letter by convreting any uppercase ltter if present
            return false;
        }

        left++;
        right--;
    }

    return true;
}
