package maq_prep;
//Code to capitalize the first letter of each word in the given sentence.
public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dbkdsj KLKLhg hGYF lojffj";
		
		System.out.println(str);
		
		String arr[] = str.split(" ");		// will break the sentene and place each word in one position

        	StringBuilder sb = new StringBuilder();			//mutable. growable and writable character sequence.
        	for (String x:arr){
           	sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        	}
		
		
		System.out.println(sb);
		
	}

}
