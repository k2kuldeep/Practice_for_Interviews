package dailyByte;

/*Given two strings representing sentences, return the words that are not common to
both strings (i.e. the words that only appear in one of the sentences). You may
assume that each sentence is a sequence of words (without punctuation) correctly
separated using space characters.
Ex: given the following strings...
sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire",
return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]
*/

import java.util.*;

public class uncommonWords {
    public static void main(String[] args) {
        String sent1 = "the tortoise beat the haire";
        String sent2 = "the tortoise lost to the haire";
        String[] res = notCommon(sent1, sent2);
        System.out.println(Arrays.toString(res));
    }

    private static String[] notCommon(String A, String B) {
        HashMap<String,Integer> map = new HashMap<>();

        for (String str:A.split(" ")){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        for (String str:B.split(" ")){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        List<String> alist = new ArrayList<>();
        for (String str:map.keySet()){
            if (map.get(str) == 1){
                alist.add(str);
            }
        }

        return alist.toArray(new String[alist.size()]);
    }
}

/*Note - The uncommon words will appear only once.
* put all in hashmap. return which are only once.*/