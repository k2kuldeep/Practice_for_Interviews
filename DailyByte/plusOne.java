package dailyByte;

/*Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each
element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {

        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] result = checkplus(digits);
        System.out.println(Arrays.toString(result));
    }

    private static int[] checkplus(int[] digits) {
       int length_of_input = (int)Math.floor(Math.log10(12345)+1);

       for (int i=digits.length-1;i>=0;i--){
           if (digits[i]<9){
               digits[i]++;
               return digits;
           }

           digits[i] = 0;
       }

       int[] result = new int[digits.length+1];
       result[0] = 1;

        return result;
    }
}

/*Note - if digit is <9 add 1 and return.Else it will be zero.
* If all digits are 9 then only one case possible, 1 at beginning and rest 0 */