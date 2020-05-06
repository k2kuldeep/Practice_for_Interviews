/*Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character. Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:
1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:
Can you solve it in O(N) time and O(1) space?*/

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";

        boolean res = backspaceCompare(S,T);
        System.out.println(res);
    }

    private static boolean backspaceCompare(String S, String T) {

        Stack<Character> Sstack = new Stack<>();
        for (char c:S.toCharArray()){
            if (c!='#'){
                Sstack.push(c);
            }
            else if (!Sstack.isEmpty()){
                Sstack.pop();
            }
        }

        Stack<Character> Tstack = new Stack<>();
        for (char c: T.toCharArray()){
            if (c!='#'){
                Tstack.push(c);
            }
            else if (!Tstack.isEmpty()){
                Tstack.pop();
            }
        }

        while(!Sstack.isEmpty()){
            char current = Sstack.pop();
            if (Tstack.isEmpty() || Tstack.pop()!=current)
                return false;
        }

        return Sstack.isEmpty() && Tstack.isEmpty();

    }
}
