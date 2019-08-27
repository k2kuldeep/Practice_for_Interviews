//wap to find lcm, hcf(gcd), factorial.
// one formula : a x b = lcm x hcf
public class LCM_HCF_FACT {

	public static void main(String[] args) {
		int result;
		int a = 15;
		int b = 20;
		
		//lcm
		result = LCMRec(a,b);
		System.out.println("LCM = "+result);
		
		System.out.println("LCM = "+ ((a*b)/HCFRec(a,b)));
		
		//hcf
		result = HCFRec(a,b);
		System.out.println("HCF = "+result);
		
		int tempa = a;
		int tempb = b;
		while( tempa != tempb){
			if(tempa > tempb)
				tempa = tempa-tempb;
			else
				tempb = tempb-tempa;
		}
		System.out.println("HCF = "+tempa);
		
		//Factorial
		int n = 4;
		result = FACRec(n);
		System.out.println("Factorial = "+result);
		
		int fac = 1;
		for(int i=2;i<=n;i++){
			fac *= i;
		}
		System.out.println("factorial = "+fac);
		

	}
	
	private static int FACRec(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		
		return n*FACRec(n-1);
	}

	private static int HCFRec(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0)
			return b;
		else if(b==0)
			return a;
		
		return HCFRec(b%a,a);
	}

	static int common = 1;
	private static int LCMRec(int a, int b) {
		// TODO Auto-generated method stub
		
		if( common%a == 0  && common%b == 0)
			return common;
		
		common++;
		LCMRec(a,b);
		return common;
	}
	
	

}
