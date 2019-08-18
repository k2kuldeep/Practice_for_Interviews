/*Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 * Eg = [-2,-3,4,-1,-2,1,5,3];
 * max_sum = 4+(-1)+(-2)+1+5 = 7
 */
public class kadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int max=Integer.MIN_VALUE,max_seen=0;
		
		for(int i=0;i<arr.length;i++){
			
			max_seen = max_seen + arr[i];
			
			if(max < max_seen)
				max = max_seen;
			
			if(max_seen < 0)
				max_seen = 0;
				
		}
		
		System.out.println(max);

	}
}
