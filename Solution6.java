/*Problem Statement: Given an array of integers and a range N, find the number of duplicates present. 
Follow-up Question 1: Do in constant space
P.S. This follow up question is asked in many high tier companies.
*/
import java.util.HashMap;
public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,1,2,2,2,3,4,5,11,12,12,12,12,12,12,12,12,12,12};
		int n = arr.length;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			if(hm.get(arr[i]) == null)
				hm.put(arr[i], 1);
			else
				hm.put(arr[i], hm.get(arr[i])+1 );
		}
		
		/*for(int i=0;i<n;i++){
			if(hm.get(arr[i]) != 1)
				System.out.println(arr[i]);
		}*/
		for(Integer i:hm.keySet()){
			//System.out.println(i);
			if(hm.get(i) != 1)
				System.out.println(i);
		}
		//System.out.println(hm);	
	}

}
