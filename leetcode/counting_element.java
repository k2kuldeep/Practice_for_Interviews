import java.util.HashSet;
import java.util.Set;

/*Given an integer array arr, count element x such that x + 1 is also in arr.
If there’re duplicates in arr, count them seperately.
Example 1:
Input: arr = [1,2,3]
Output: 2
Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
Example 2:
Input: arr = [1,1,3,3,5,5,7,7]
Output: 0
Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
Example 3:
Input: arr = [1,3,2,3,5,0]
Output: 3
Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
Example 4:
Input: arr = [1,1,2,2]
Output: 2
Explanation: Two 1s are counted cause 2 is in arr.
Example 5:
Input: arr = [1,1,2]
Output: 2
*/
public class counting_element {
    public static void main(String[] args) {

        int arr[] = {1,1,2};

        Set<Integer> set = new HashSet<>();
        for (int i:arr)
            set.add(i);

        int count = 0;
        for (int i:arr){
            if (set.contains(i+1))
                count++;
        }
        System.out.println(count);
    }
}

/*Note - Set does not store duplicate elements.
to add element in set, there is function - set.add()
while in hasmap it is - map.put() */
