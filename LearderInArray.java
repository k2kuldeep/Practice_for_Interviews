/*Find the leader in array. for a leader 'L' - all element on right side of 'L' are less than 'L'. 
 the last element is always a leader.
*/
public class LearderInArray {

	public static void main(String[] args) {
		int arr[] = {15,16,3,2,6,1,4};
		
		int i,j;
		for(i=0;i<arr.length;i++){
			
			for(j=i+1;j<arr.length;j++){
				
				if(arr[j]>=arr[i])
					break;
				
			}
			
			if(j==arr.length)
				System.out.println(arr[i]);
		}
	}

}
