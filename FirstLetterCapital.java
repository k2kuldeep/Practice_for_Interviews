package maq_prep;
//Code to capitalize the first letter of each word in the given sentence.
public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dbkdsj KLKLhg hGYF lojffj";
		
		//str = str.toLowerCase();
		System.out.println(str);
		
		StringBuilder s = new StringBuilder();		//mutable. growable and writable character sequence.
		
		char c = ' ';								// to contain every character of string
		for(int i=0;i<str.length();i++){
			
			if(c==' ' && str.charAt(i) != ' ')
				s.append(Character.toUpperCase(str.charAt(i)));
			else
				s.append(str.charAt(i));
			
			c = str.charAt(i);
		}
		
		
		System.out.println(s);
		
	}

}
