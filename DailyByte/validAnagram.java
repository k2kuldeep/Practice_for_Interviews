package dailyByte;

/*Given two strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.
Ex: Given the following strings...
s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false
Note - In anagram, all words should match.
s = "ab", t = "a", return false
*/

public class validAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        boolean res = checkValidAnagram(s,t);
        System.out.println(res);
    }

    private static boolean checkValidAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        else{
            int[] arr = new int[26];
            for (char x:s.toCharArray()){
                arr[x-'a']++;
            }

            for (char x:t.toCharArray()){
                arr[x-'a']--;
                if (arr[x-'a']<0)
                    return false;
            }
        }

        return true;
    }
}

/*Note - if anagram, then should be of same size.
* create an array of all alphabets and increase count of ones found in s. then decrease
* the count for ones found in t and check for count<0*/