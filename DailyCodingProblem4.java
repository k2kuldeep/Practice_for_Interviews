import java.util.HashMap;
/*Given an array of integers, find the first missing positive integer in linear time and constant space.
 In other words, find the lowest positive integer that does not exist in the array. 
 The array can contain duplicates and negative numbers as well.
 For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 You can modify the input array in-place.(Asked in Stripe interview)
*/
public class DailyCodingProblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {2,3,-7,6,8,1,-10,15};
		int arr[] = {2,3,7,6,8,-1,-10,15};
		int n = arr.length;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			if(arr[i] > 0){
				if(hm.get(arr[i]) == null)
					hm.put(arr[i], 1);
				else
					hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		
		System.out.println(hm);
		
		for(int i=1;i<n;i++){
			if(hm.get(i) == null){
				System.out.println(i);
				System.exit(0);
			}	
		}
		
		//check "https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/" for other approach
		
	}

}
