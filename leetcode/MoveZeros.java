/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        int j = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        for (int i=j;i<nums.length;i++)
            nums[i]=0;

        System.out.println(Arrays.toString(nums));
    }
}

// Note: reversal algo to reverse and array - first to last and last to first. first++ and last--.
// print an 1-D array - Arrays.toString(array)
// Multidimensional array = Arrays.deepToString(array)
