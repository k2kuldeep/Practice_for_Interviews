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
//2nd Method
//if sum is 9 and number of digits is 2 then answer would be 18
import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();      //required Sum
		int d=sc.nextInt();      //number of digits
		int y=1,k=d;
		String num="";
		if(s<=d*9) {
		while(k>0){
			if(check(k-1, s-y)) {
				s=s-y;
				k--;
				num+=y;
				y=0;
			}
			else {
				y++;
			}
		}
		System.out.println(num);  
		}
		else {
			System.out.println("-1");
		}
	}
		
	static boolean check(int i, int j) {
		if(i*9>=j)
			return true;
		return false;
	}
}
