package dailyByte;

import java.util.Stack;

/*Given two strings s and t, which represents a sequence of keystrokes, where # denotes a
backspace, return whether or not the sequences produce the same result.
Ex: Given the following strings...
s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
*/
public class compareKeyStrokes {
    public static void main(String[] args) {
//        String s = "a##c";
//        String t = "#a#c";
        String s = "bxj##tw"; // input for checking character with null
        String t = "bxj###tw"; // input for checking character with null
        boolean res = compareKeys(s,t);
        System.out.println(res);
    }

    private static boolean compareKeys(String S, String T) {
//        int i=S.length()-1;
//        int j =T.length()-1;
//        int skip_s = 0;
//        int skip_t = 0;
//
//        while (i>=0 || j>=0){
//            //getting actual character to compare in s
//            while(i>=0){
//                if (S.charAt(i)=='#'){skip_s++;i--;}
//                else if (skip_s>0){skip_s--;i--;}
//                else break;
//            }
//            //getting actual character to compare in t
//            while(j>=0){
//                if (T.charAt(j)=='#'){skip_t++;j--;}
//                else if (skip_t>0){skip_t--;j--;}
//                else break;
//            }
//            if (i>=0 && j>=0 && S.charAt(i)!=T.charAt(j))
//                return false;
//
//            //checking if comparing character with null
//            if ((i>=0)!=(j>=0))
//                return false;
//
//            i--;j--;
//        }
//
//        return true;

        Stack<Character> stack_s = new Stack<>();
        for (char ch:S.toCharArray()){
            if (ch!='#')
                stack_s.push(ch);
            else if (!stack_s.isEmpty()){
                stack_s.pop();
            }
        }

        Stack<Character> stack_t = new Stack<>();
        for (char ch:T.toCharArray()){
            if (ch!='#')
                stack_t.push(ch);
            else if (!stack_t.isEmpty()){
                stack_t.pop();
            }
        }

        while (!stack_s.isEmpty()){
            char current = stack_s.pop();
            if (stack_t.isEmpty() || current!=stack_t.pop()){
                return false;
            }
        }

       return stack_s.isEmpty() && stack_t.isEmpty();

    }

}
/*Note - Two stack approach - push in stack if a character is found.
*   on geting '#' pop. now the stack contains only characters which should be equal.
*  compare both the stack character one by one.
*  Two pointer approach - if '#' is found, make skip++ and i--. next if a character
*  is found and skip is > 0, make skip-- and i--. else check that character with other
* string.*/