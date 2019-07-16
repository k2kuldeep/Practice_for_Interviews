//hackerrank hourglass question
// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
import java.util.*;
public class ArrayQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
		
		int maxsum=-999,x=0;
		for(int i=0;i<4;i++){
			int sum =0;
			for(int j=x;j<=x+2;j++){
				sum += arr[i][j];
				if(j==x) sum += arr[i+1][j+1];
				sum += arr[i+2][j];
			}
			if(x<3)
				x++;
			else
				x=0;
			if(sum>maxsum)
				maxsum = sum;
			if(x!=0)
				i--;
				
		}
		
	   System.out.println(maxsum);
		
	}

}
