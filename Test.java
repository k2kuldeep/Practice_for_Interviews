//EPAM Sample Paper
public class Test {

	public static void main(String[] args) {
		
		/*String aa = "110010";
		
		int arr[] = new int[aa.length()];
		
		for(int i=0;i<aa.length();i++){
			arr[i] = (Character.getNumericValue(aa.charAt(i)));		//convert String to integer array
		}
		
		int x=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] == 1){
				int pp = arr[i];
				arr[i] = arr[x];
				arr[x++] = pp;
			}
		}
		
		for(int j:arr)
			System.out.print(j+"\t");*/
		
		//-----------------------------------------------------------------------------
		// count vowel in string
		/*String aa = "Google";
		
		char arr[] = aa.toCharArray(); // convert String to character array
		int count=0;
		for(char x : arr){
			if(x=='a' || x=='A')
				count++;
			else if(x=='e' || x=='E')
				count++;
			else if(x=='i' || x=='I')
				count++;
			else if(x=='o' || x=='O')
				count++;
			else if(x=='u' || x=='U')
				count++;
		}
		
		System.out.println(count);*/
		
		//--------------------------------------------------------------------------
		
		//remove extra spaces
		String s= " jack    is  from      America.";
		
		System.out.println(s.trim().replaceAll("( )+", " ")	//removes extra space
		.replace("."," "));					// removes '.'
		
	}

}
