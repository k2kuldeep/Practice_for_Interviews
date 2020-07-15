package dailyByte;

/*Given a string, return whether or not it uses capitalization correctly.
A string correctly uses capitalization if all letters are capitalized,
no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/

public class correctCapitalization {
    public static void main(String[] args) {
        String s = "Calvin";
        boolean x = checkCapital(s);
        System.out.println(x);
    }

    private static boolean checkCapital(String s) {

        int y = s.charAt(1);
        if (y >= 65 && y<=90)
        {
            for (int i=0;i<s.length();i++){
                char x = s.charAt(i);
                if (x<65 || x>90)
                    return false;
            }
        }
        else{
            for (int i=2;i<s.length();i++){
                char x = s.charAt(i);
                if (x<97 || x>122)
                    return false;
            }
        }
        return true;
    }
}

/*Note - check if the second word is capital or not.*/