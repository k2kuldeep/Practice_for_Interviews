/*Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
Input : n = 20 
Output: 2 3 5 7 11 13 17 19
*/
public class SieveOfEratosthenes {
	public static void main(String args[]){
		
		int n = 1000;		//print prime numbers less than 30
		sieveOfEratosthenes(n);
	}

	private static void sieveOfEratosthenes(int n) {
		// TODO Auto-generated method stub
		
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i] = true;
		
		for(int p=2; p*p <= n; p++){
			
			if(prime[p] == true){
				//mark all multiples of p
				for(int i=p*p;i<n;i+=p)
					prime[i] = false;
			}
		}
		
		for(int i=2;i<n;i++){
			if(prime[i] == true)
				System.out.print(i+" ");
		}
		
		
	}

}
