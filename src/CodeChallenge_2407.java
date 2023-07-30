/*
Find the closest pair to a given sum in two sorted arrays
        Given two sorted arrays, find a pair whose sum is closest to a given sum
        where the pair consists of elements from each array.
        For example:
        Input:
        first[] = { 1, 8, 10, 12 }
        second[] = { 2, 4, 9, 15 }
        target = 11
        Output: The closest pair is [1, 9]

        Input:
        first[] = { 10, 12, 15, 18, 20 }
        second[] = { 1, 4, 6, 8 }
        target = 22
        Output: The closest pair is [18, 4]
*/

import java.util.*;

public class CodeChallenge_2407 {

    static void findClosestPair(int[] array1, int[] array2,int target){
        int minDiff=Integer.MAX_VALUE;
        TreeMap<Integer, int[]> map =  new TreeMap<>();
        for (int i=0;i<array1.length;i++){
            for (int j=0; j<array2.length;j++){
                System.out.println("MinDiff: " + minDiff+ " => "+ (target - (array1[i] + array2[j])));
                int num = target - (array1[i] + array2[j]);
                if(num>=0 && num < minDiff){
                    minDiff = num;
                    System.out.println(array1[i]+" "+array2[j]);
                    map.put(minDiff, new int[]{array1[i],array2[j]});
                }
            }
        }
        System.out.println(Arrays.toString(map.firstEntry().getValue()));
    }

    public static void main(String[] args) {
        int[] first = { 1, 8, 10, 12  };
        int[] second = {  2, 4, 9, 15 };

        findClosestPair(first, second, 11);
    }
}
