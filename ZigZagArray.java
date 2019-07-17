/*Convert a normal array into a zigzag array. Eg. - array = [5,10,8,12,6,9,4]
 * The elements form a zigzag form. 5<10, 10>8, 8<12, 12>6, 6<9, 9>4 . Elements follow < , > order alternatively.
 * if a=5, b=10, c=8, d=12 then a < b > c and b > c < d. 
 */
public class ZigZagArray {
	static int arr[] = {3,4,6,2,1,8,9};
	public static void main(String[] args) {
		
		System.out.print("Initial Array:\t");
		for(int j:arr)
			System.out.print(j+" ");
		
		System.out.println();
		
		boolean flag = false;
		int i=0,temp=0;
		while(i<arr.length-1){
			
			if(!flag){			//if flag = false then i<i+1 (if not then swap)
				if(arr[i]>arr[i+1]){
					//swap
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}	
			}
			else{				//if flag = true then i>i+1 (if not then swap)
				if(arr[i]<arr[i+1]){
					//swap
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
			
			for(int k:arr)
				System.out.print(k+" ");
			System.out.println();
			i++;
			flag = !(flag);
		}
		
		System.out.print("final array:\t");
		for(int k:arr)
			System.out.print(k+" ");
		
	}
}