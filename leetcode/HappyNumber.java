/*Write an algorithm to determine if a number n is "happy".
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
Return True if n is a happy number, and False if not.
Example:
Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1        
 */
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

        int n = 20;

        Set<Integer> set = new HashSet<>();
        while(n==1){
            if (set.contains(n)){
               System.out.println("False");
               break;
           }
            set.add(n);
            n = calcsum(n);

       }
        System.out.println("true");

    }

    public static int calcsum(int temp){
        int sum = 0;
        while(temp>0){
            sum += (int)Math.pow(temp%10,2);
            temp = temp/10;
        }

        return sum;
    }
}

/*NOTE:when in an infinite loop the numbers will repeat themselves.Use of HashSet*/
