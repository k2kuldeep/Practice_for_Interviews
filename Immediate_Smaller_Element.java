import java.util.Scanner;

/* Geeks for geeks intervew prep q
Given an integer array of size N.For each element in the array, check whether there exist a smaller element on the next immediate
  position of the array. If such an element exists, print that element. If there is no smaller element on the immediate next 
  to the element then print -1.
  Example:
Input
2
5
4 2 1 5 3
6
5 6 2 3 1 7
Output
2 1 -1 3 -1
-1 2 -1 1 -1 -1
Explanation:
Testcase 1: Array elements are 4, 2, 1, 5, 3. Immediate smaller of 2 is immediate smaller of 4, 1 is immediate smaller of 2, no 
immediate smaller of 1, 3 is immediate smaller of 5, and no immediate smaller for last element exists. So ouput is : 2 1 -1 3 -1.
 */
public class Immediate_Smaller_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int t = sc.nextInt();	//number of test cases
		while(t>0){
		int n = sc.nextInt();		// no of input
		int arr[] = new int[n];
		for(i=0;i<n;i++){
			arr[i] = sc.nextInt();
			if(i!=0 && arr[i-1]>arr[i])
				System.out.print(arr[i]+" ");
			else if(i!=0)
				System.out.print("-1"+" ");
		}
		System.out.print("-1"+"\n");
		t--;
		}
	}
}
//reduce time complexity