package dailyByte;

/*. Given a string representing the sequence of moves a robot vacuum makes, return whether or not
it will return to its original position. The string will only contain L, R, U, and D characters,
representing left, right, up, and down respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

public class vaccumCleanerRoute {
    public static void main(String[] args) {
        String s = "RUULLDRD";
        boolean x = checkroute(s);
        System.out.println(x);
    }

    private static boolean checkroute(String s) {

        int countup=0;
        int countleft=0;
        s = s.toLowerCase();

        for (char x:s.toCharArray()){
            if (x=='u')
                countup++;
            else if (x=='d')
                countup--;

            if (x=='l')
                countleft++;
            else if (x=='r')
                countleft--;
        }

        return (countup==0 && countleft==0);
    }
}

/*Note - Stack will not work coz it may come to original position , so stack zero and
 then go down and come back to  original position.
 Hence two pointer method will do. both in last should be zero for same position*/