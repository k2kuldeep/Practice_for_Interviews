/*The objective is to determine a path through the maze along the roads so that one can exit the maze with the minimum weight in the cart.
For example, in the maze shown, the least weight one can exit the maze is 22 kg.
Input
4
-> 1 8 21 7
19 17 10 20
2 18 23 22
14 25 4 13 ->
Output
22
Explanation
One possible path through the maze is through the intersections with coordinates
(1,1),(1,2),(2,2),(2,3)(2,4)(3,4),(4,4). This would result in the cart having a weight of 22 kg ( at the intersections on this path,,
the weight in the cart after the exchange are 1,8,17,18,18,20,22,22
*/
public class WeightedMazeProblem { //Asked in TCS DIGITAL

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][] = {{1,29,40,24,12},{13,31,40,31,33},{29,40,1735,32},{15,39,283,31},{15,21,31,38,24}};
		int a[][] = {{1,8,21,7},{19,17,10,20},{2,18,23,22},{14,25,4,13}};
		int n1 = a.length;
		int n2 = a[0].length;
		
		//System.out.println(n1+""+n2);
		
		int ans = getcost(a,n1,n2);
		System.out.println(ans);
	}

	private static int getcost(int[][] a, int x, int y) {//x=5,y=5
		// TODO Auto-generated method stub
		int max = a[0][0];
		int i=0,j=0;
		
		while(j!=x-1 && i!=y-1){
			if(a[i+1][j] > a[i][j+1])
			{
				if(a[i][j+1] > max)
					max = a[i][j+1];
				j++;
			}
			else{
				if(a[i+1][j] > max)
					max = a[i+1][j];
				i++;
			}
		}	
		
		//if reached to last row or last column but not end position
		if(j==y-1){
			while(i<x-1){
				
				if(max < a[i][j])
				max = a[i][j];
				
				i++;
			}
		}
		else{
			while(j<y-1){
				
				if(max < a[i][j])
				max = a[i][j];
				
				j++;
			}
		}
		
		return max;
	}

}
