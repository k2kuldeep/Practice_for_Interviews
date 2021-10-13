import java.util.Scanner;
public class BinaryToHexadecimal
{
   public static void main(String[] args)
   {
      int[] hexaDecimal = new int[1000];
      int a = 1, b = 0, r, decimal = 0, binary;
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter binary number: ");
      binary = sc.nextInt();
      while(binary > 0)
      {
         r = binary % 2;
         decimal = decimal + r * a;
         a = a * 2;
         binary = binary / 10;
      }
      a = 0;
      while(decimal != 0)
      {
         hexaDecimal[a] = decimal % 16;
         decimal = decimal / 16;
         a++;
      }
      System.out.print("Equivalent hexadecimal value is: ");
      for(b = a - 1; b >= 0; b--)
      {
         if(hexaDecimal[b] > 9)
         {
            System.out.print((char)(hexaDecimal[b] + 55) + "\n");
         }
         else
         {
            System.out.print(hexaDecimal[b] + "\n");
         }
      }
      sc.close();
   }
}