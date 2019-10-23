//To use BigInteger must import below one.
import java.math.BigInteger;
public class StringMatchFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "11111";
		System.out.print(str.matches("(.*)101(.*)"));
		
		//-----------------------------------------------------------------------------------------------------------------
		//Base Change Program. All data type have base 10only. converting to base 16.
		int x = 145;
		
		BigInteger br = new BigInteger(x+"",10);//10 is the initial base
		String s = br.toString(16);//16 is the base into which converted
		
		System.out.println(s);
	}
	
}