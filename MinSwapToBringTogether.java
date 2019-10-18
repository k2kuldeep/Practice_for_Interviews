package Practice;
/*Given an array of n positive integers and a number k.
Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
Output: 1
Explanation: 
To bring elements 2, 1, 3 together, swap 
element '5' with '3' such that final array
will be-
arr[] = {2, 1, 3, 6, 5}

Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
Output: 2*/

public class MinSwapToBringTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 9, 5, 8, 7, 4};
		int a=5;
		
		for(int z:arr)
			System.out.print(z+" ");
		
		System.out.println();
		
		int mid = arr.length/2;
		
		//taking two pointers and going upto mid.
		int i=0;
		int j=arr.length-1;
		int count = 0;
		while(i<=mid && j>mid){
			
			while(arr[i] < a){
				i++;
			}
			
			while(arr[j] > a){
				j--;
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			count ++;
			
			for(int z:arr)
				System.out.print(z+" ");
			
			System.out.println("   count = "+count);
			
		}

	}

}
