/*Remove duplicate from sorted array
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,2,3,3,4,4,4,5};
		int arr1[] = new int[arr.length];
		
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i] != arr[i+1]){
				arr1[j] = arr[i];
				j++;
			}
			
			arr1[j] = arr[arr.length-1];
			
			/*for(int k:arr1){
				System.out.print(k);
			}
			
			System.out.println();*/
		}
		
		for(int i:arr1){
			System.out.print(i);
		}
	}

}
