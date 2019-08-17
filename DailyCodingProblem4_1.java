/*Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times.
 Find these repeating numbers in O(n) and using only constant memory space.
 this approach is only possible if number in array are up to the size of array.
 */
public class DailyCodingProblem4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
        int n = arr.length; 
        
        for(int i=0;i<n;i++){
        	
        	if(arr[Math.abs(arr[i])] >= 0)
        		arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        	else
        		System.out.println(Math.abs(arr[i]));
        }
	}

}
