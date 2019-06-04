/*Problem Statement: Given a string, return the longest consecutive character and its length. For example, in string "AABCDDEBBBEA", return "B 3" since B occurs max for 3 consecutive times

Follow-Up question:     Do this in one pass, ie, in O(n).
Follow-Up question 2:   Do this without using additional space.
 */
import java.util.*;
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// AABCDDEBBBEA
		
		// aaaabbcbbb
		
		int max = 1;
		int count=1;
		char x='a';
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i) == str.charAt(i+1))
			{
				count++;
				//System.out.println(str.charAt(i)+" "+str.charAt(i+1));
				//System.out.println("Count = "+count);
			}	
			else
			{
				if(count > max)
				{
					max = count;
					x = str.charAt(i);
					//System.out.println("x = "+x);
				}
					
				count = 1;
				//System.out.println(str.charAt(i+1));
				//System.out.println("max = "+max);
			}
				
		}
		
		System.out.println(x+" "+max);
		sc.close();
		
	}

}
