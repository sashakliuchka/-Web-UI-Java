package org.lesson4;

public class Functions {
    //11
    //1
    //123321
    //2332
    public static boolean isPalindrome(String word) {
        if (word.length() < 2) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }

    //--------isPalindrome(123321) --true
    //-------isPalindrome(2332)  --true
    //-----isPalindrome(33)   --true
    //----isPalindrome()  --true
}
