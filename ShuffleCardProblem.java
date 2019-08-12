import java.util.*;
/* You have 100 cards, numbered 1 to 100. You distribute them into k piles and collect back the piles in order.
For example, if you distribute them into 4 piles, then the first pile will contain the cards numbered 1, 5, 9, … and 
the 4th pile will contain the cards numbered 4, 8, 12, … While collecting back the cards you collect first the last pile, 
flip it bottom to top, then take the third pile, flip it bottom to top and put the cards on top of the 4th pile and so on.
Next round, you distribute the cards into another set of piles and collect in the same manner (last pile first and first pile last).

If we have 10 cards and put them into 2 piles, the order of the cards in the piles (top to bottom) would be 9, 7, 5, 3, 1 and 10, 8, 6, 4, 2
We flip the piles to get the order 1, 3, 5, 7, 9 and 2, 4, 6, 8, 10
We put the first pile at the top of second to get the deck 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.

Given the number of rounds (m), the number of piles in each round (ki),
you need to write a program to find the Nth card from the top at the end of the final round.

Input: An array arr[] representing the number of piles in each of the round.
Output: One integer representing the Nth card after all rounds have been played.

Constraints: Number of rounds <= 10, number of piles in each round <= 13.

Input: arr[] = {2, 2}, N = 4
Output: 13
We have two rounds. The first round has two piles.
At the end of the round, the deck is in the following order: 1, 3, 5, …, 99, 2, 4, 6, …, 100
The next round also has 2 piles and after the second round, the cards are in the order 1, 5, 9, 13, …
The fourth card from the top has number 13.*/
public class ShuffleCardProblem {		//Asked in tcs digital
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int piles[] = {2, 2};		//no. of piles in each round
		int rounds = piles.length;	//no. of rounds
		int n = 4;		//Nth card from top
		
		int ans = rounds(piles,rounds,n);
		System.out.println(ans);
		
	}

	private static int rounds(int[] piles, int rounds, int n) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=100;i++)
		list.add(i);
		
		for(int i=0;i<rounds;i++)
			currentRound(list, piles[i]);
		
		return list.get(n-1);
	}

	private static void currentRound(List<Integer> list, int totlpile) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> alist = new ArrayList<>();
		
		//creating pile(i) divisions of arrayList
		for(int i=0;i<totlpile;i++)
			alist.add(new ArrayList<Integer>());
		
		//adding elements to pile one by one
		int j=0;
		for(int i=0;i<100;i++){
			alist.get(j).add(list.get(i));
			j = (j+1) % totlpile;
		}
		
		// list.set(int index, Element E) updates the element of specified index with the given element E.
		int pileNo=0;
		j=0;
		for(int i=0;i<100;i++){
			list.set(i, alist.get(pileNo).get(j));
			j++;
			
			//if one pile is over add the next pile
			if( j >= alist.get(pileNo).size()){
				pileNo++;
				j=0;
			}
		}
		
	}
}
