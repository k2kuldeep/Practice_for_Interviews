/*Remove duplicate from sorted array
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,2,3,3,4,4,4,5};
		
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//method 1 - using temporary array
		int temp[] = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i] != arr[i+1]){
				temp[j] = arr[i];
				j++;
			}
		}
			temp[j] = arr[arr.length-1];
			
		for(int i:temp){
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//method 2 - using constant space
		int k=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] != arr[i+1]){
			arr[k] = arr[i];
			k++;
			}
		}
		arr[k] = arr[arr.length-1];
		//making the rest element zero
		for(int i=k+1;i<arr.length-1;i++)
		arr[i] = 0;
		
		for(int i:arr){
			System.out.print(i+"\t");
		}
		
	}

}
