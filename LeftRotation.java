import java.util.*;
public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		if(d>n)
			d = d%n;
		
		//method 1
		/*for(int i=0;i<d;i++)
		{
			int temp = arr[0],j;
			for(j=0;j<n-1;j++)
				arr[j] = arr[j+1];
			
			arr[j] = temp;
		}
		
		for(int k:arr)
			System.out.print(k+"\t");*/
		
		//method 2 - to understand watch geeks for geeks video
		int g_c_d = gcd(n,d);		//find gcd to determine no. of sets in which array is divided
		for(int i=0;i<g_c_d;i++)	//array will run for each no. of sets
		{
			int temp = arr[i];
			int j=i;
			while(true){
				int k=(j+d)%n;		//one element of each set
				if(k==i)
					break;
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		
		for(int k:arr)
			System.out.print(k+"\t");
		
	}
	
	static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		else if(b==0)
			return a;
		else if(a>b)
			return gcd(a%b,b);
		else
			return gcd(a,b%a);
	}
	
	/*static int lcm(int a,int b)
	{
		int common=1;
		if(common%a==0 && common%b==0)
			return common;
		common++;
		lcm(a,b);
		return common;
	}*/
}
