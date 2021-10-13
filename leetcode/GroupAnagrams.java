/*Given an array of strings, group anagrams together.
Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:
All inputs will be in lowercase.
The order of your output does not matter.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};


        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            char[] character = s.toCharArray();
            Arrays.sort(character);
            String sorted = Arrays.toString(character);
            if (!map.containsKey(sorted))
                map.put(sorted, new ArrayList<>());

            map.get(sorted).add(s);
        }

        System.out.println(new ArrayList<>(map.values()));

        }
}
