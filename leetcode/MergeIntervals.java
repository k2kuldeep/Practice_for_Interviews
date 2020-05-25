/*
Given a collection of intervals, merge all overlapping intervals.
Example 1:
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,10},{15,18}};
         
        int[][] result = merge(a);
        for (int[] i:result)
            for (int j:i)
                System.out.print(j);
    }

    private static int[][] merge(int[][] intervals) {
        if (intervals.length<=1)
            return intervals;

        Arrays.sort(intervals, (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));

        List<int[]> list = new ArrayList<>();
        int[] current_interval = intervals[0];
        list.add(current_interval);
        for (int[] interval:intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (next_begin <= current_end){
                current_interval[1] = Math.max(current_end,next_end);
            }
            else{
                current_interval = interval;
                list.add(current_interval);
            }

        }

        return list.toArray(new int[list.size()][]);
    }
}

/*Note - 1. sorting an Array
 2. changing the element in current_array changes the element in list also.
 3. do again*/
