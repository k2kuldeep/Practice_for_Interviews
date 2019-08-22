public class SeedDispersion1 {
	public static void main(String[] args) {
		
		int n = 6;
		
		
		int arr[] = new int[n];
		arr[1-1] = 1;
		arr[6-1] = 1;
		
		int time=0;
		System.out.println("At time = "+time);
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		while(Arrays.stream(arr).min().getAsInt() != 1){
			
			for(int i=0;i<arr.length-1;i++){
				if(arr[i] == 1 && arr[i+1]==0){
					arr[i+1] = 1;
					i+=1;
				}				
			}
			
			for(int j=arr.length-1;j>0;j--){
				if(arr[j]==1 && arr[j-1]==0){
					arr[j-1] = 1;
					j-=1;
				}
			}
			
			System.out.println("At time = "+(++time));
			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();
			
		}
		
	}
}