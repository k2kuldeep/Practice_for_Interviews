/*Create a list,  seqList, of N empty sequences, where each sequence is indexed from 0 to N-1 . The elements within each of the N sequences also use 0-indexing.
Create an integer, lastAnswer , and initialize it to 0.
The  2 types of queries that can be performed on your list of sequences (seqList) are described below:
Query: 1  x  y
Find the sequence, seq , at index ((x^lastAnswer)%N) in seqList
Append integer y to sequence seq.
Query: 2 x y
Find the sequence, seq , at index ((x^lastAnswer)%N) in seqList.
Find the value of element y%size in (where  is the size of ) and assign it to lastAnswer .
Print the new value of lastAnswer  on a new line
*/
import java.util.*;
public class DynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//no. of sequence
		int q = sc.nextInt();		//no. of queries

		/*List<List<Integer>>  arr= new ArrayList<>();
		for(int i=0;i<n;i++)
			arr.add(new ArrayList<>());*/
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(n);
		for(int i=0;i<n;i++)
			arr.add(new ArrayList<Integer>());
		
		int lastAnswer =0;
		
		for(int i=0;i<q;i++)
		{
			int List[] = new int[3];
			
			for(int j=0;j<3;j++)
				List[j] = sc.nextInt();
			
			int x = List[1];
			int y = List[2];
			
			int seqIndex = (x^lastAnswer)%n;
			
			if(List[0]==1)
				arr.get(seqIndex).add(y);
			else{
				lastAnswer = arr.get(seqIndex).get(y%(arr.get(seqIndex).size()) );
				
				System.out.println(lastAnswer);
			}
		}
		
	}
}
