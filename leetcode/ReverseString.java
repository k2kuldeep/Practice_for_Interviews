/*Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/


public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        reverseString(s);

    }
private static void reverseString(String[] s) {

        int start = 0;
        int end = s.length-1;

        while(start<end){
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

        for(String str :s)
            System.out.println(str);

    }
}

/*Note - The best method to reverse anything.
reversing a string is based on using the opposite directional two-pointer approach
*/
