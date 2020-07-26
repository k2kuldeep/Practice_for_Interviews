package dailyByte;

import java.util.Stack;

/*Given a string only containing the following characters (, ), {, }, [, and ] return
whether or not the opening and closing characters are in a valid order.
Ex: Given the following strings...
"(){}[]", return true
"(({[]}))", return true
"{(})", return false
*/
public class validateCharacters {
    public static void main(String[] args) {
        String s = "()";
        boolean res = checkValid(s);
        System.out.println(res);
    }

    private static boolean checkValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);

            if (x=='('|| x=='{' || x=='[') {
                st.push(x);
                continue;
            }
            if (x==')' || x=='}' || x==']'){
                if (st.isEmpty())
                    return false;
                if (checkMatch(st.peek(),x))
                    st.pop();
                else
                    return false;
            }
        }

        return st.isEmpty();
    }
    public static boolean checkMatch(char char1,char char2){
        if (char1 == '(' && char2 == ')')
            return true;
        else if (char1 == '{' && char2 == '}')
            return true;
        else if (char1 == '[' && char2 == ']')
            return true;
        else
            return false;
    }
}

/*Note - done by stack. if opening brackets found, then push it to stack.
* on closing brackets found, first check if stack is not empty, then match the brackets.
* if it does not match, return false.*/