/*
Given an unlimited supply of coins of given denominations, find the total number of distinct ways to get the desired change.
        For example:
        Input: S = { 1, 3, 5, 7 }, target = 8

        The total number of ways is 6

        { 1, 7 }
        { 3, 5 }
        { 1, 1, 3, 3 }
        { 1, 1, 1, 5 }
        { 1, 1, 1, 1, 1, 3 }
        { 1, 1, 1, 1, 1, 1, 1, 1 }


        Input: S = { 1, 2, 3 }, target = 4

        The total number of ways is 4

        { 1, 3 }
        { 2, 2 }
        { 1, 1, 2 }
        { 1, 1, 1, 1 }
*/

import java.util.Arrays;

public class CodeChallenge_1807 {

    public static int count(int[] array, int target)
    {
        int T[] = new int[target+1];
        T[0] = 1;

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("i => "+i);
            for (int j = array[i]; j <= target; j++) {
                System.out.println("T["+j+"] "+ T[j]+ " T["+(j-array[i])+"] "+T[j - array[i]]);
                T[j] += T[j - array[i]];
                System.out.println("Updated value T["+j+"] is "+ T[j]);
            }
        }
        return T[target];
    }

    public static void main(String[] args) {
        int[] array = { 1, 3 };
        Arrays.sort(array);
        System.out.println("Count is : "+count(array,5));
    }
}
