package dailyByte;

/*Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays.
Ex: Given the following arrays...
nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
*/

import java.util.*;

public class intersectionOfNumbers {
    public static void main(String[] args) {
        int[] nums1 = {2,4,4,2};
        int[] nums2 = {2,4};
        int[] res = findIntersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {
        List<Integer> alist = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int i:nums1){
            set.add(i);
        }

        for (int i=0;i<nums2.length;i++){
            if (set.contains(nums2[i])) {
                alist.add(nums2[i]);
                set.remove(nums2[i]);   //remove the element from set so that it is not added again.
            }
        }

        int[] result = new int[alist.size()];
        for (int i=0;i<alist.size();i++)
            result[i] = alist.get(i);

        return result;
    }
}

/*Note - Put all numbers in set. When found in second array,
remove that number from set so no match again.*/