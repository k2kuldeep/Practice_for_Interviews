/*Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.
Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
Constraints:
The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
num >= 1
You could assume no leading zero bit in the integer’s binary representation.*/

import java.math.BigInteger;
public class NumberComplement {
    public static void main(String[] args) {
        int num = 5;

        int n = num;
        int sum =0;
        while(n>0){
            sum = (sum<<1) +1;
            n = n>>1;
        }

        System.out.println(sum -num);

//        BigInteger bi = new BigInteger(String.valueOf(num));
//        String bin = bi.toString(2);
//
//        String str = "";
//        for (int i=0;i<bin.length();i++){
//            char x = bin.charAt(i);
//            if (x=='1')
//                str = str+'0';
//            else
//                str = str+'1';
//        }
//
//        b = new BigInteger(str,2);
//        System.out.println(Integer.parseInt(b.toString(10)));

    }
}

/*Note: <<(left shift) - msb is lost and insert zeros from right
    Eg. 8(1000) << 1 = 16(10000)
 >>(right shift) - removes least significant bit
 eg. 8(1000) >> 1 = 4(100)
 >>> is unsigned-right-shift; it'll insert 0.
 >> is signed-right-shift, and will extend the sign bit.
*/
