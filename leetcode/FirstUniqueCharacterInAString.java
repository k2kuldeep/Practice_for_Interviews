/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
Examples:
s = "leetcode"
return 0.
s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.*/

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int x = firstUnique(s);
        System.out.println(x);
    }

    private static int firstUnique(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if (!map.containsKey(current)){
                map.put(current,i);
            }
            else{
                map.put(current,-1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c: map.keySet()){
            if (map.get(c) > -1 && map.get(c)<min)
                min = map.get(c);
        }

        return (min == Integer.MAX_VALUE)? -1: min;
    }
}
