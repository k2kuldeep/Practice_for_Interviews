/*Write an efficient program to count number of 1s in binary representation of an integer.
 Input : n = 6
 Output : 2
Binary representation of 6 is 110 and has 2 set bits
Brian Kernighan’s Algorithm: Initialize count: = 0
      If integer n is not zero
      	(a) Do bitwise & with (n-1) and assign the value back to n
          	n: = n&(n-1)
      	(b) Increment count by 1
      	(c) go to step 2
      Else return count
*/
public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		
		int count = 0;
		while(n>0){
			n &= (n-1);
			count++;
		}
		
		System.out.println("No. of set bits are = "+count);

	}

}
/* n =  9 (1001)
   count = 0

   Since 9 > 0, subtract by 1 and do bitwise & with (9-1)
   n = 9&8  (1001 & 1000)
   n = 8
   count  = 1

   Since 8 > 0, subtract by 1 and do bitwise & with (8-1)
   n = 8&7  (1000 & 0111)
   n = 0
   count = 2

   Since n = 0, return count which is 2 now.
 */