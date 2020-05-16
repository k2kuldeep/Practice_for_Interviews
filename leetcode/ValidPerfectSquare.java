/*Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.
Example 1:
Input: num = 16
Output: true
Example 2:
Input: num = 14
Output: false
Constraints:
1 <= num <= 2^31 - 1*/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;

        System.out.println(isPerfectSquare(num));

    }

    private static boolean isPerfectSquare(int num) {

//        double x = Math.sqrt(num);
//        if (x == Math.floor(x))
//            return true;
//        else
//            return false;

        long low = 1;
        long high = num;

        while(low<=high){
            long mid = low-(low-high)/2;

            if(mid*mid == num){
                return true;
            }
            else if(mid*mid < num)
                low=mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}

/*NOTE - middle element - low - ((low -high)/2)
*/
