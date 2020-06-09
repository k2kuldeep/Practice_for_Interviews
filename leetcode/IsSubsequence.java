/*Given a string s and a string t, check if s is subsequence of t.
A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the 
characters without changing the order of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its 
subsequence. In this scenario, how would you change your code?
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
Both strings consists only of lowercase characters.
*/

public class IsSubsequence {
    public static void main(String[] args) {

//      to get length of input
//      int n = 536870912; 
//      System.out.println(Math.floor(Math.log10(n)+1));

        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }

    private static boolean isSubsequence(String s, String t) {

        if (s.length() == 0)    // empty string is by default a substring
            return true;
        if (t.length() == 0)
            return false;

        /*
        // 1st method- 
        int j =0;
        for (int i=0;i<t.length() && j<s.length();i++) //if all s characters are found then
                                        // no need to check.so second check condition
            if (s.charAt(j) == t.charAt(i))
                j++;
        return j==s.length();
        */

        int index =-1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c , index+1);
            if (index == -1)
                return  false;
        }

        return true;
    }
}


/*Note - Subsequence means string exist not necessarily continuous manner but in the same sequence.
    Substring means string exist in continuous manner*/
