/*Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
Note: Please solve it without division and in O(n).
Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
*/

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] sol = productExceptSelf(nums);
        
        for (int i:sol)
         System.out.print(i+" ");
    }

    private static int[] productExceptSelf(int[] nums) {

        if (nums.length == 0)
            return null;

        int len = nums.length;

        int[] rnum = new int[len];
        int[] lnum = new int[len];

        lnum[0] = 1;
        for (int i=1;i<len;i++){
            lnum[i] = lnum[i-1]*nums[i-1];
        }

        rnum[len-1] = 1;
        for (int i=len-2;i>=0;i--){
            rnum[i] = rnum[i+1]*nums[i+1];
        }

        int[] result = new int [len];
        for (int i =0;i<len;i++){
            result[i] = lnum[i]*rnum[i];
        }

        return result;
    }
}

/*Note - one way to take product and count number of zeros.
* there will be 3 cases - if (count == 0), if(count == 1),
* if(count > 1) return empty array
*/
