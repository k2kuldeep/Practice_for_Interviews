/*
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
Note:
The number of people is less than 1,100. 
Example
Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/
import java.util.*;

public class QueueReconstructionbyHeight {
    public static void main(String[] args) {

        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        //  [[7, 0], [7, 1], [6, 1], [5, 0], [5, 2], [4, 4]]

        int [][] arr = reconstructQueue(people);
        for (int[] a: arr)
            System.out.print(Arrays.toString(a)+" ");
    }

    private static int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (p,q) -> p[0]==q[0]? p[1]-q[1]:q[0]-p[0]);
        System.out.println(Arrays.deepToString(people));

        List<int[]> list = new ArrayList<>();
        for (int i =0;i<people.length;i++){
            list.add(people[i][1],people[i]);
        }
        
        return list.toArray(new int[people.length][2]);
    }
}

/*Note - sort in ascending and descending 
*/
