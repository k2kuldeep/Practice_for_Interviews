import java.math.BigInteger;
/*Given an array of integers, return a new array such that each element at index i of the new array 
 is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
*/
public class DailyCodingProblem2 {		//Product Array Puzzle

	public static void main(String[] args) {
		
		int arr[] = {10,3,5,6,2};
		int n = arr.length;
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		
		/*multiply all terms of array and divide by individual position to get the required output. 
		To use BigInteger need to convert into BigInteger type using "BigInteger.valueOf()" function*/
		BigInteger big = new BigInteger("1");
		for(int i=0;i<n;i++)
		big = big.multiply(BigInteger.valueOf(arr[i]));
		
		//big.intvalue is used to get integer value of BigInteger.
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++)
			arr1[i] = big.intValue()/arr[i];
		
		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println();
		
		
		//2nd method
		int left[] = new int[n];
		int right[] = new int[n];
		
		//creating left array
		left[0] = 1;
		for(int i=1;i<n;i++)
			left[i] = arr[i-1]*left[i-1];
		
		//creating right array
		right[n-1] = 1;
		for(int i=n-2;i>=0;i--)
			right[i] = arr[i+1] * right[i+1];
		
		for(int i=0;i<n;i++)
			System.out.print(left[i]*right[i]+" ");
		
	}
}
//Time Complexity - O(N)