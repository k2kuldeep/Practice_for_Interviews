/*Given a string, sort it in decreasing order based on the frequency of characters.
Example 1:
Input:
"tree"
Output:
"eert"
Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:
Input:
"cccaaa"
Output:
"cccaaa"
Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:
Input:
"Aabb"
Output:
"bbAa"
Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.*/

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";

        String output = frequencySort(s);
        System.out.println(output);
    }

    private static String frequencySort(String s) {

        if (s.length()<=1)
            return s;

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)-> map.get(b)-
                map.get(a));
        maxheap.addAll(map.keySet());


        StringBuilder result = new StringBuilder();
        while(!maxheap.isEmpty()){
            char current = maxheap.remove();
            for (int i=0;i<map.get(current);i++)
                result.append(current);
        }

        return result.toString();
    }
}

/*Note - max heap -  basically a prioority queue
* Sort max heap -
* PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
* adding elemnts to heap - maxheap.addAll(map.keySet()); */
