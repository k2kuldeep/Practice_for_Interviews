/*Suppose, you are provided with an unending stream of sorted integers 
  like 1,1,1,1,2,2,2,3,4,5,11,12,12,12,12,12,12,12,12,12,12...
You don't know the length of this stream. Your task is to find an integer in this stream and print its 
position(any one of the position). There can be unending number of duplicates.

Follow-up Question 1: Better complexity than O(n)
Follow-up Question 2: What will change in your code if negative numbers are present.
Follow-up Question 3: Return the number of duplicates of the given number. Ex- in above stream, if number is 2, you have to return 3.
*/
import java.util.*;
public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,1,1,1,2,2,2,3,4,5,11,12,12,12,12,12,12,12,12,12,12};
		int k = 5;
		
		int result = findpos(arr,k);
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("answer = "+ result);
		
		sc.close();
	}
	
	public static int findpos(int arr[],int k){
		int i=0,j=1;		// i = low , j = high
		int val = arr[0];
		
		//check if twice of high < value to find
		while(val < k){
			i = j;
			
			if(2*j < arr.length)		// increase high value by double
				j = j*2;
			else
				j = arr.length-1;
			
			val = arr[j];
		}
		
		return BinSearch(arr, i, j, k);
	}
	
	// binary search time : 0(log n)
	public static int BinSearch(int arr[],int first,int last,int n){
		if(last > first){
		int mid = (first+last)/2;
		
		if(arr[mid] == n)
			return mid;
		else if (arr[mid] > n)
			return BinSearch(arr,first,mid-1,n);
		else
			return BinSearch(arr,mid-1,last,n);
		}
		return -1;
	}

}
