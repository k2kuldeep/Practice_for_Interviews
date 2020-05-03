//kadane algorithm
public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int x = max_subarray(nums);
        System.out.println(x);

    }

    private static int max_subarray(int[] nums) {

        int max = nums[0];
        int max_till_now = 0;

        for (int num : nums) {
            max_till_now += num;

            if (max < max_till_now)
                max = max_till_now;

            if (max_till_now < 0)
                max_till_now = 0;

        }

        return max;
    }

}
//Note: remember kadane algo. first compare max to max_till_now.
// or else will get output 0 in case of negative number maximum.
