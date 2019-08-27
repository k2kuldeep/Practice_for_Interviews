//WAP to print the nearest prime number less than the given number. (Useful Sieve of Sundaram).
// done using sieve of Eratosthenes
public class NearestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 20;
		
		boolean arr[] = new boolean[k+1];
		
		for(int i=0;i<k;i++)
			arr[i] = true;
		
		for(int p=2;p*p<k;p++)
			for(int i=p*p;i<k;i=i+p)
				arr[i] = false;
		
		for(int i=k;i>=0;i--)
			if(arr[i] == true){
				System.out.println(i);
				System.exit(0);
			}

	}
}
