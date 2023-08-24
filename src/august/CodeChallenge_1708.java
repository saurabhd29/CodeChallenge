package august;/*
Given an integer array having distinct elements, find the surpasser count for each element in it.
In other words, for each array element, find the total number of elements to its right, which are greater than it.
        For example:
        Input:  { 4, 6, 3, 9, 7, 10 }

        Output: { 4, 3, 3, 1, 1, 0 }
*/

import java.util.Arrays;


public class CodeChallenge_1708 {

    private static void findSurpasser(int[] array) {

        int[] countArray = new int[array.length];
        for(int i=0; i< array.length; i++){
            int count=0;
            for (int j=i; j< array.length; j++){
                if(i==j){
                    continue;
                }
                if(array[i] < array[j]) {
                    count++;
                }
            }
            countArray[i] = count;
        }
        System.out.println(Arrays.toString(countArray));
    }

    public static void main(String[] args) {
        int[] array = { 4, 6, 3, 9, 7, 10 };
        findSurpasser(array);
    }



}
