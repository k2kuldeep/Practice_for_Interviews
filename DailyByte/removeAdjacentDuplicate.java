package dailyByte;

import java.util.Stack;

/*Given a string s containing only lowercase letters, continuously remove adjacent
characters that are the same and return the result. 
Ex: Given the following strings...
s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"
*/
public class removeAdjacentDuplicate {
    public static void main(String[] args) {
        String s = "foobar";
        String res = removeAdjacent(s);
        System.out.println(res);
    }

    private static String removeAdjacent(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if (stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch==stack.peek()){
                    stack.pop();
            }
            else
                stack.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.insert(0,stack.pop());
        }

        return str.toString();
    }
}

/*Note - in cases with deleting a character use Stack. */