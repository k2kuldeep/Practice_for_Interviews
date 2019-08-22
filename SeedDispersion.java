import java.util.*;
//seed dispersin asked in wheelseye
public class SeedDispersion {
	
	static int arr[] = new int[6];		//size of array
	static int time = 0;

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		int n=6;
		int k=2;
		int keys[] = {1,5};		//positions where seed fall
		
		for(int i=0;i<n;i++){
			if(i==0 || i==4)		//making 1 where seed fall(1-1 and 5-1)
				arr[i] = 1;
			else
				arr[i] = 0;			//else all position 0
		}
		
		System.out.println("time  = "+time);		//time zero all positions
		for(int i:arr)
			System.out.print(i+"\t");
		System.out.println();
		
		nextStep(arr);
	}

	private static void nextStep(int[] arr) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		while(Arrays.stream(arr).min().getAsInt() != 1){
			
			for(int i=0;i<arr.length;i++){
				if(arr[i] == 1)
					hm.put(i,arr[i]);			//storing index of 1 in array 
				}
			
			makenext(hm);
			hm.clear();
			time++;
			
			System.out.println("this time = "+time);
			for(int i:arr)
			System.out.print(i+"\t");
			System.out.println();
		}
		System.out.println("final time = "+time);
	}

	//in this function manipulating (i-1) and (i+1) positions of array.
	private static void makenext(HashMap<Integer, Integer> hm) {
	
		for(int i:hm.keySet()){
			if(i-1>=0 && arr[i-1]!=1)
				arr[i-1] = 1;
			if(i+1<arr.length && arr[i+1]!=1)
				arr[i+1] = 1;
		}
		
	}
}