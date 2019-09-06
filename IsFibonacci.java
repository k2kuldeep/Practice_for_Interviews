package maq_prep;

public class IsFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=1;n<=10;n++){
		boolean result = (checkroot(5*n*n + 4) || checkroot(5*n*n -4));
		System.out.println(n +" is "+result);
		}
	}


	private static boolean checkroot(int x) {
		
		int s = (int)Math.sqrt(x);				//this should be integer only else code will not work
		return (s*s == x);
	}

}
