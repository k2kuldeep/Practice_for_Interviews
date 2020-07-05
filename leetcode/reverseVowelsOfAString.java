/*Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Input: "hello"
Output: "holle"
Example 2:
Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
*/

public class reverseVowelsOfAString {
    public static void main(String[] args) {
    
      String s = "leetcode";
      String str = reverseString(s);
      System.out.println(str);
    }

    private static String  reverseString(String s) {
        char[] ch = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (!isVowel(ch[start]))
                start++;

            if (!isVowel(ch[end]))
                end--;

            if (isVowel(ch[start]) && isVowel(ch[end])) {
                char temp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = temp;
            }
        }

        return new String(ch);

    }

    static boolean isVowel(char temp) {
        return (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ||
                temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U');
    }

}
