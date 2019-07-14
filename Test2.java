//Epam Test
public class Test2 {

	public static void main(String[] args) {
		
		/*//1,2,3,5,7 - no loop
		//4,6,9 - 1 loop
		//in 8 - 2 loops
		
		int n = 165;
		int count = 0;
		while(n!=0){
			int x = n%10;
			
			if(x == 8)
				count+=2;
			else if(x == 4 || x== 6 || x == 9)
				count++;
			
			n = n/10;
		}
		
		System.out.println(count);*/
		
		//--------------------------------------------------------------
		
		//generate all substrings of a string and count vowel
		// in abc , substrings are {'a','b','c','ab','bc','ac','abc'} total vowel = 3(a is 3 times)
		
		/*String s = "abcde";
		int total =0;
		for(int i=0;i<s.length();i++)
		{
			for(int j = i+1;j<=s.length();j++){
				String x = s.substring(i, j);
				
				//System.out.println(x);
				
				int count = 0;
				for(int k=0;k<x.length();k++){
					int y = x.charAt(k);
					if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
						count++;
				}
				total += count;
			}
		}
		System.out.println("noumber of vowel = "+total);*/
		
		//---------------------------------------------------------
		
		//mobile keypad maximum length problem
		
	}

}
