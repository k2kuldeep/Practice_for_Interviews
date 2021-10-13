package leet_code;

import java.util.Arrays;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};
        System.out.println("before = "+Arrays.toString(arr));
        int n = removeDuplicate(arr,arr.length);
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    private static int removeDuplicate(int[] arr,int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        //System.out.println(Arrays.toString(arr));
        arr[j++] = arr[n-1];
        return j;
    }
}
/*Note - take a pointer j.If consecutive elements are not equal put element at i to
* element at j and j++. since loop is till n-1. hence n-1 and n are not checked.
* So put n-1 element at jth position.*/