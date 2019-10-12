Base Change Sum problem.
 -Input format-
     2    //number of inputs
  [base]   [haxadecimal no.]
     6        a
     7        23
     12     //base of resultant sum
 -Output-
     54
     
 -[Explanation]
   a base 6 is 14
   23 base 7 is 50
   sum =64
   result should be in base 12
   64 base 12 is 54
 
//CODE
import java.math.BigInteger;
import java.util.Scanner;

public class NucleusQue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arb[]=new int[n];
		String arn[]=new String[n];
		for(int i=0;i<n;i++) {
			arb[i]=sc.nextInt();
			arn[i]=sc.next();
		}
		int k=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			BigInteger br=new BigInteger(arn[i],16);
			String s=br.toString(arb[i]);
			sum=sum+Integer.parseInt(s);
		}
		
		BigInteger br2=new BigInteger(sum+"", 10);
		String s2=br2.toString(k);
		System.out.println(s2);
	}
}
