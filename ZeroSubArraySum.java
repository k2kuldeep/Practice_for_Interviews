import java.util.HashMap;
/*Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
 Input: {4, 2, -3, 1, 6}
 Output: true 
 There is a subarray with zero sum from index 1 to 3.
 HINT : 
 arr[] = {1, 4, -2, -2, 5, -4, 3}
 If we consider all prefix sums, we can notice that there is a subarray with 0 sum when :
 1) Either a prefix sum repeats or
 2) Or prefix sum becomes 0.
 Prefix sums for above array are:
 1, 5, 3, 1, 6, 2, 5
 Since prefix sum 1 repeats, we have a subarray with 0 sum.
 */
public class ZeroSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-3,2,3,1,6};
		HashMap<Integer, Integer> hM =  
                new HashMap<Integer, Integer>(); 
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
        {  
            // Add current element to sum 
            sum += arr[i]; 
              
            // Return true in following cases 
            // a) Current element is 0 
            // b) sum of elements from 0 to i is 0 
            // c) sum is already present in hash map 
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                          
                System.out.println("true");
              
            // Add sum to hash map 
            hM.put(sum, i); 
        }
		System.out.println("False");
	}

}
