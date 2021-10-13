/*Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the 
validity of a string by these rules:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
Note:
The string size will be in the range [1, 100].
*/

import java.util.Stack;
public class ValidParenthesisString {
    public static void main(String[] args) {
    
        String s = "(*)";
        Boolean sol = checkValidString(s);
        System.out.println(sol);

    }

    private static Boolean checkValidString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(') {
                s1.push(i);
            }

            if (x == ')') {
                if (!s1.isEmpty())
                    s1.pop();
                else if (!s2.isEmpty())
                    s2.pop();
                else
                    return false;
            }

            if (x == '*') {
                s2.push(i);
            }
        }

        while(!s1.isEmpty()) {
                if (!s2.isEmpty() && (s1.peek() < s2.peek())){
                    s1.pop();
                    s2.pop();
                }
                else
                    return false;

        }

        return true;
    }

}
