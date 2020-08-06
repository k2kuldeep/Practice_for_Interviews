package dailyByte;

import java.util.Arrays;
import java.util.HashMap;

/*Given two arrays of numbers, where the first array is a subset of the second array,
return an array containing all the next greater elements for each element in the first array,
in the second array. If there is no greater element for any element, output -1 for
that number.
Ex: Given the following arrays…
nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in nums2 is
greater than 4, 3 is the first number in nums2 greater than 1, and no element in nums2
is greater than 2.
nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1] because 3 is the first greater element
that occurs in nums2 after 2 and no element is greater than 4.
note - if adjacent element is not greater then check for greater element in further array.
*/
public class greaterElements {
    public static void main(String[] args) {
        int[] num1 = {1,3,5,2,4};
        int[] num2 = {6,5,4,3,2,1,7};
        int[] res = checkGreater(num1,num2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] checkGreater(int[] num1, int[] num2) {
        int[] res = new int[num1.length];

        if (num2.length==0 || num1.length==0)
            return res;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<num2.length-1;i++){
            if (num2[i]<num2[i+1]){
                map.put(num2[i],num2[i+1]);
            }
            else{
                int j=i+2;
                while(j<num2.length && num2[i]>num2[j]){
                    j++;
                }
                if (j==num2.length)
                    map.put(num2[i],-1);
                else
                    map.put(num2[i],num2[j]);

            }
        }
        map.put(num2[num2.length-1],-1);

        for (int i=0;i< num1.length;i++){
            res[i] = map.get(num1[i]);
        }
        return res;
    }
}

/*Note - put all in hashmap with next greater element as key.*/