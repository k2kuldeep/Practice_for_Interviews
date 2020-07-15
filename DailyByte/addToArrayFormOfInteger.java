package dailyByte;

/*For a non-negative integer X, the array-form of X is an array of its digits in
left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
Given the array-form A of a non-negative integer X, return the array-form of the
integer X+K.
Example 1:
Input: A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:
Input: A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:
Input: A = [2,1,5], K = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
Example 4:
Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000
Note：
    1 <= A.length <= 10000
    0 <= A[i] <= 9
    0 <= K <= 10000
    If A.length > 1, then A[0] != 0
*/

import java.util.ArrayList;
import java.util.List;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1200};
        int k = 34;

        List<Integer> result = addToArrayForm(arr,k);
        System.out.println(result);

    }

    private static List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> alist = new ArrayList<>();

        int i = A.length-1;
        while(i>=0 || K>0){
            if (i>=0)
                K+=A[i--];

            alist.add(0,K%10);
            K /=10;
        }

        return alist;
    }
}

/*Note - one case if k is 3 digit and A is single digit
 Method - take one digit out of array and add to K. Addition will take care of carry*/