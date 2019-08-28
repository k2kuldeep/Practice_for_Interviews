//Counting all permutations of a string.
public class StringPermutation {
	static String str = "ABC";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permutation(str,0,str.length()-1);
		System.out.println(count);
	}
	
	static int count;
	private static void permutation(String str, int i, int n) {
		// TODO Auto-generated method stub
		
		if(i==n)
		{
			count++;
		}
		else{
			for(int j=i;j<=n;j++){
				swap(i,j);
				permutation(str,i+1,n);
				swap(i,j);
			}
		}
		
	}
	
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		str = String.valueOf(ch);
		//System.out.println(str);
		
	}

}
