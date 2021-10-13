package dailyByte;

/*Given a string representing your stones and another string representing a list of jewels,
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "AaaddfFf", stones = "Af", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/

import java.util.HashMap;

public class JewelsAndStone {
    public static void main(String[] args) {
        String jewels = "AaaddfFf";
        String stones = "Af";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }

    private static int numJewelsInStones(String J, String S) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch:J.toCharArray())
            map.put(ch, map.getOrDefault(ch,0)+1);

        for (char ch:S.toCharArray()){
            if (map.containsKey(ch))
                count += map.get(ch);
        }
        return count;
    }
}
