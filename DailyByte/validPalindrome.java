package dailyByte;

/*Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...
"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
*/

import java.util.ArrayList;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "0P";

        boolean x = checkpalinrome(s);
        System.out.println(x);
    }

    private static boolean checkpalinrome(String s) {

        ArrayList<Character> alist = new ArrayList<>();
        s= s.toLowerCase();
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);

            if ((x>=65 && x<=90 ) || (x>=97 && x<=122) || (x>=48 && x<=57)){
                alist.add(x);
            }
        }
        System.out.println(alist);

        int i=0;
        int j=alist.size()-1;

        while(i<j){
            if (alist.get(i)==alist.get(j)){
                i++;
                j--;
            }
            else
                return false;
        }

        return true;
    }
}

/*Note - check while reversing the string if equidistant characters are same.*/