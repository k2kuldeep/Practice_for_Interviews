/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace 
and initial word order.
Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/

public class reverseWordsIII {
    public static void main(String[] args) {
      String s = "Let's take LeetCode contest";
      String str = reverseString(s);
  }
  
 public String reverseWords(String s) {
        
        String words[] = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word:words)
            sb.append(new StringBuffer(word).reverse().toString()+" ");
        
        
        return sb.toString().trim();
    }
}

/*Note - String builder has function reverse.*/
