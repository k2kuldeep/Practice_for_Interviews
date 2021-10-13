/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
Example 1:
Input: [3,2,3]
Output: 3
Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2 */
import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        double len = Math.floor(nums.length/2);

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x:nums){
            if (!map.containsKey(x))
                map.put(x,1);
            else{
                map.put(x,(int)map.get(x)+1);
            }
        }

        for (int x:map.keySet()){
            if (map.get(x)>len){
                System.out.println(x);
            }
        }

    }
}
