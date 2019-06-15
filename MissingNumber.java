//Given an array containing all numbers from 1 to n except one number.find the missing number(using summation and xor operation)
// follow up : what if two numbers are missing
import java.util.Scanner;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,5,7,4,2,3};
		System.out.println("Enter the last element");
		int n = sc.nextInt();
		
		//using summation method
		//summationMethod(arr,n);
		
		//using xor method
		findByXor(arr,n);
		
	}

	private static void findByXor(int[] arr,int n) {
		// TODO Auto-generated method stub
		
		//xor sum upto last element
		int xorsum = 0;
		for(int i=1;i<=n;i++)
			xorsum = xorsum^i;
		
		//xor of array
		int arrayxor = 0;
		for(int i=0;i<arr.length;i++)
			arrayxor = arrayxor ^ arr[i];

		System.out.println("Missing number = "+(xorsum^arrayxor));
			
	}

	private static void summationMethod(int[] arr,int n) {
		// TODO Auto-generated method stub
		int sum = (n*(n+1))/2;
		
		//sum of array given
		int givensum=0;
		for(int i=0;i<arr.length;i++)
			givensum = givensum + arr[i];
		
		System.out.println("missing number = "+(sum-givensum));
	}
}