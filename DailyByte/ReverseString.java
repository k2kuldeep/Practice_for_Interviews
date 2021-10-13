package dailyByte;

/*To reverse a String*/

public class ReverseString {
    public static void main(String[] args) {
        String str = "Cat";

        String s = reverse(str);
        System.out.println(s);
    }

    private static String reverse(String str) {
        int i =0;
        int j =str.length()-1;
        char[] ch = str.toCharArray();

        while(i<j){
            char x = ch[i];
            ch[i++] = ch[j];
            ch[j--] = x;
        }

        return new String(ch);
    }
}

/*Note - best method to reverse a String.*/
