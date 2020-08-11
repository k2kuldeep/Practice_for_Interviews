package leet_code;
/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.
For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...

Example 1:
Input: 1
Output: "A"
Example 2:
Input: 28
Output: "AB"
Example 3:
Input: 701
Output: "ZY"
*/
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n = 701;
        String res = getColumnTitle(n);
        System.out.println(res);
    }

    private static String getColumnTitle(int n) {
        /*String s = "";
        while(n>0){
            n--;
            int x = n%26;
            char temp = (char)(x+'A');
            s = temp +s;
            n = n/26;
        }
        return s;
        */

        StringBuilder str = new StringBuilder();
        while(n>0){
            n--;
            int x = n%26;
            str.insert(0,(char)(x+65));
            n/=26;
        }
        return str.toString();
    }
}
/*Note - better time complexity with StringBuilder instead of String. */