/*Problem Statement : Find the nth number of the series. Series is a defined as
sum of unique powers of 5 starting from 1.
5 , 25 , 30(5+25) , 125 , 130(125+5) , 150(125+25) , 155(125+25+5)...... 

Follow-Up Question 1: Use Constant Space ie, no extra array
Follow-Up Question 2: Try doing it in O(log n)
*/
import java.util.*;

class Solution3
{
	public static void main (String[] args)
	{
		// your code goes here
		/*Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		int x = 6;
		
		//converting number to binary
		String num = "";
		while(x != 0){
			num = num + (x%2);
			x = x/2;
		}
		
		//System.out.println(num);
		
		double sum = 0;
		for(int i=num.length();i>0;i--){
			//System.out.println(num.charAt(i-1) + " \t" + Math.pow(5,i));
			int z = Character.getNumericValue(num.charAt(i-1));
			
			sum = sum +  z * Math.pow(5,i);
			//System.out.println(sum);
		}
		System.out.println(sum);*/
		
		
		//-----------------------------------------------------------------------------
		
		int n = 5;
		int pow = 1,answer = 0;
		
		while(n!=0){
		pow = pow*5;		// multiples of 5
		//System.out.println("pow = "+pow);
		
		if((int)(n & 1) == 1){		// & gives 1 if last bit is 1 .
			//System.out.println("n & 1 = "+ (n&1));
			answer += pow;
			//System.out.println("answer = "+answer);
			
		}
		
		n >>= 1;		//proceed to next bit
		//System.out.println("n = "+n);
		
		}
		System.out.println("answer = "+answer);
	}
}

