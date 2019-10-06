package Practice;
// Array given - abababacdc
import java.util.*;
public class Box8InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char arr[] = {'a','b','a','b','a','b','a','c','d','c'};
		
		int len = arr.length;
		
		Map<Character, ArrayList<Integer>> hm = new HashMap<>();
		
		for(int i=0;i<len;i++){
			if(!hm.containsKey(arr[i])){
				hm.put(arr[i], new ArrayList<Integer>());
				hm.get(arr[i]).add(i);
			}
			else
				hm.get(arr[i]).add(i);
		}
		
		System.out.println(hm);

	}

}
