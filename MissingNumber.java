//Given an array containing all numbers from 1 to n except one number.find the missing number(using summation and xor operation)
// a^0 = a
// a^a = 0
// follow up : what if two numbers are missing
import java.util.Arrays;
import java.util.Scanner;
class MissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,5,7,6,2,3};
		
		//find by sorting
		//bySort(arr);
				
		//using summation method
		//summationMethod(arr);
		
		//using xor method
		int num = findByXor(arr);
		System.out.println("missing number = "+ num);
		
		int arr1[] = {1,2,4,6};		// missing 3 and 4
		twoMissing(arr1);
		
		sc.close();
	}

	private static void twoMissing(int[] arr) {
		// idea is to divide array by middle number and find one in both the array
		int len = arr.length+2;
		
		long totalsum = len*(len+1)/2;
		
		long arrsum = 0;
		for(int i:arr)
			arrsum += i;
		
		int pivot = (int)((totalsum - arrsum)/2);
		//System.out.println("pivot = "+ pivot);
		int totalleft=0;
		int arrleft=0;
		int totalright=0;
		int arrright=0;
		
		for(int i=1;i<=pivot;i++)
			totalleft ^=i;
		for(int i=pivot+1;i<=len;i++)
			totalright ^=i;
		for(int i:arr)
			if(i<=pivot)
				arrleft ^=i;
			else
				arrright ^=i;
			
		System.out.println("left missing = "+(totalleft^arrleft)+"\n"+"right missing = "+(totalright^arrright));
		
	}

	private static int findByXor(int[] arr) {
		// TODO Auto-generated method stub
		int xorsum = 0;
		int arrayxor = 0;
		
		int len = arr.length+1;
		
		//xor sum upto last element
		for(int i=1;i<=len;i++)
			xorsum ^= i;
		
		//xor of array
		for(int i:arr)
			arrayxor ^=i;

		return (xorsum^arrayxor);
	}

	private static void summationMethod(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length +1;
		int sum = (n*(n+1))/2;
		
		//sum of array given
		int givensum=0;
		for(int i:arr)
			givensum += i;
		
		System.out.println("missing number = "+(sum-givensum));
	}
	
	private static void bySort(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]+1 == arr[i+1])
				continue;
			else
			{
				System.out.println("missing = "+ (arr[i]+1));
				System.exit(0);
			}	
		}
	}
}