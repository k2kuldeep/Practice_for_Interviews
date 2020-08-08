package dailyByte;

/*Given a string and the ability to delete at most one character, return whether
or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
Ex: Given the following strings...
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/

public class validPalindromeWithRemoval {
    public static void main(String[] args) {
        String str = "aba";
        boolean res = checkpalindrome(str);
        System.out.println(res);
    }

    private static boolean checkpalindrome(String s) {
        int low = 0;
        int high = s.length()-1;

        while(low<high){
            if (s.charAt(low) != s.charAt(high))
                return isPalindrome(s,low+1,high) || isPalindrome(s,low,high-1);

            low++;
            high--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while(i<=j){
            if (s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}

/*Note - same a checking for palindrome word. keep i++ and j-- until
* the characters are not same. At that point check is (low+1,high) is palindrome
* or (low,high-1) is palindrome. */