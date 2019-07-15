import java.util.HashMap;

/*Given an array of integers where each value 1 <= x <= len(array), 
	write a function that finds all the duplicates in the array and remove the duplicates.
 */
public class RemoveDuplicateUnsortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,1,2,2,3,4,3,4,4,5};
		
		System.out.println("Initial array");
		for(int i:arr)
			System.out.print(i+"\t");
		
		System.out.println();
		
		
		//putting all numbers in hashmap
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.get(arr[i]) == null)
				hm.put(arr[i], 1);
			
			else
				hm.put(arr[i], hm.get(arr[i])+1);
		}
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		
		//keeping only one from each keysset pair
		int arr1[] = new int[hm.size()];
		int k=0;
		for(Integer i: hm.keySet()){		//hm.keySet() return all the keys
			arr1[k++] = i;
		}
		
		
		System.out.println("Final array");
		for(int i:arr1)
			System.out.print(i+"\t");
		
		
	}

}
