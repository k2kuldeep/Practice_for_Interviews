package maq_prep;

public class SmallestNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s= 9;
		int m =2;
		
		//check for minimum
		if(s==0){
			if(m==1)
				System.out.println("Smallest number is 0");
			else
				System.out.println("Not possible");
		}
		
		//check for maximum
		if(s > 9*m){
			System.out.println("Not possible");
		}
		
		int arr[] = new int[m];
		
		s = s-1;	//deduct 1 for first position
		
		for(int i=m-1;i>0;i--){
			if(s > 9){
				arr[i] = 9;
				s = s-9;
			}
			else{
				arr[i] = s;
				s = 0;
			}
		}
		
		arr[0] = s+1;
		
		for(int i:arr)
			System.out.print(i);
		

	}

}
