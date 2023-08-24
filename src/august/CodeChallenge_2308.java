package august;/*
Given an array arr[] denoting heights of N towers and a positive integer K.

        For each tower, you must perform exactly one of the following operations exactly once.

        Increase the height of the tower by K
        Decrease the height of the tower by K
        Find out the minimum possible difference between the height of the shortest and
        tallest towers after you have modified each tower.

        Example 1:

        Input:
        K = 2, N = 4
        Arr[] = {1, 5, 8, 10}
        Output:
        5
        Explanation:
        The array can be modified as
        {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
        The difference between
        the largest and the smallest is 8-3 = 5.
        Example 2:

        Input:
        K = 3, N = 5
        Arr[] = {3, 9, 12, 16, 20}
        Output:
        11
        Explanation:
        The array can be modified as
        {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.
        The difference between
        the largest and the smallest is 17-6 = 11.
*/

import java.util.Arrays;

public class CodeChallenge_2308 {

    private static int findAverage(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        return sum/array.length;
    }
    private static void findShortestDistance(int[] array, int k, int n) {

        int avg = findAverage(array);
        System.out.println(avg);

        for(int i=0;i<array.length;i++){
            if(array[i]>=avg){
                array[i] = array[i] - k;
            }else {
                array[i] = array[i] + k;
            }
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("The difference between the largest and the smallest is "+ (array[array.length-1] - array[0]));
    }

    public static void main(String[] args) {
        int[] array = {3, 9, 12, 16, 20};
        int k=3;
        int n=5;
        findShortestDistance(array,k,n);
    }

}
