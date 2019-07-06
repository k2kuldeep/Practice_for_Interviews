//hackerrank flipping bits question
public class DecimalToBinary {

	public static void main(String[] args) {
		
		long n = 0;
		long maxInt=(long)Math.pow(2, 32)-1;
		System.out.println(maxInt - n);
		
		/*
		// converting decimal to binary 32 bits
		long n = 0;
		long tobin[] = new long[32];
	    long temp = n;
	    int i=31;
	    while(temp!=0){
	        tobin[i] = temp%2;
	        temp = temp/2;
	        i--;
	    }

	    for(long k:tobin)
	    	System.out.print(k);
	    
	    System.out.println();
	    
	    for(int k=0;k<tobin.length;k++){
            if(tobin[k] == 0)
            tobin[k] = 1;
            else
            tobin[k] = 0;
        }
	    
	    for(long k:tobin)
	    	System.out.print(k);
	    
	    System.out.println();

	    //converting binary to decimal
	    int decimal = 0;
	    int base = 1;
	    for(int j=tobin.length-1;j>0;j--){
	        decimal += tobin[j]*base;

	        base *= 2;
	    }
	    
	    System.out.println("value = "+decimal);
*/
	}
}
