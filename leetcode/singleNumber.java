/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:
Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
 
public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4,5,6,7,5,6,7,};

        int res = nums[0];
        for(int i=1;i<nums.length;i++)
            res ^= nums[i];

        System.out.println(res);

    }

}

/*NOTE:
1. method1 : put in hasmap and then count. 
2. method2 :sort and check if consecutive numbers are same.
3. XOR of a number with itself is 0.
4. XOR of a number with 0 is number itself.*/
