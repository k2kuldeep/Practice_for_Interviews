package dailyByte;

/*Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
*/

import java.util.Arrays;

public class addBinary {
    public static void main(String[] args) {
        String s1 = "1100011";
        String s2 = "10";
        String s = addBin(s1,s2);
        System.out.println(s);
    }

    private static String addBin(String s1, String s2) {

        StringBuilder sb = new StringBuilder();
        //String result="";
        int i = s1.length()-1;
        int j = s2.length()-1;

        int carry = 0;

        while(i>=0 || j>=0){

            int sum = carry;

            sum += (i>=0)? s1.charAt(i--)-'0':0;        // add/sub two character converts to integer
            sum += (j>=0)? s2.charAt(j--)-'0':0;

            sb.insert(0,sum % 2);
            //result = sum%2 + result;
            carry = sum / 2;
        }

        if (carry > 0){
            sb.insert(0,1);
            //result = 1+result;
        }


        return sb.toString();
    }
}

/*Note - 1. on adding/subtracting two character ,
it gets implicitly converted to integer.
2. StringBuilder is faster than String*/