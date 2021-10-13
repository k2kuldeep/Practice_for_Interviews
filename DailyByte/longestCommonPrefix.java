package dailyByte;

/*Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.
Ex: Given the following arrays...
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
["flower","flow","flight"], return "fl"
["dog","racecar","car"], return ""
*/

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"colorado", "color", "cold"};
        //String res = checklongestCommonPrefix(arr);
        String res = lcpByDivideAndConquer(arr);
        System.out.println(res);
    }

    // 2nd method - Divide and Conquer
    private static String lcpByDivideAndConquer(String[] strs) {
        if (strs == null || strs.length == 0)
            return null;

        return checkbydivideAndConquer(strs, 0, strs.length-1);
    }

    private static String checkbydivideAndConquer(String[] strs, int l, int h) {
        // if low and high are same, means low and high points to the same word
        if (l==h)
            return strs[l];

        else{
            int mid = (l+h)/2;
            // reduce the array of words to two words.
            String lcpLeft = checkbydivideAndConquer(strs, l, mid);
            String lcpRight = checkbydivideAndConquer(strs, mid+1, h);
            // find common between two words
            return findCommon(lcpLeft, lcpRight);
        }
    }

    private static String findCommon(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i=0;i<min;i++){
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0,i);
        }
        return left.substring(0,min);
    }

    // 1st method - match each character from 1st string to the rest of array
    private static String checklongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        for (int i =0;i<strs[0].length();i++){
            char x = strs[0].charAt(i);
            for (int j =1;j<strs.length;j++){
                if (strs[j].charAt(i) != x || i == strs[j].length()) // character does not match or index out of bound
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
