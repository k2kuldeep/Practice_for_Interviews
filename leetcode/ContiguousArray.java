/*
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Note: The length of the given binary array will not exceed 50,000.
*/

import java.util.Arrays;
import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {

//        int n = 536870912;
//        get length of input
//        System.out.println(Math.floor(Math.log10(n)+1));

         int[] nums = {0,1,1,0,1,1,1,0};
         int x = findMaxLength(nums);
         System.out.println(x);
    }

    private static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(0,-1);

        int max_len = 0;
        int  count =0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] == 0)
                count--;
            else
                count++;

            if (counts.containsKey(count))
                max_len  = Math.max(max_len, i-counts.get(count));
            else
                counts.put(count,i);
        }

       return max_len;
    }
}

/*Note - add -1 if zero occur and add 1 if 1 occur.
if count occurs again means equal number found*/
