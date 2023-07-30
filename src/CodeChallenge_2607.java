/*
Given an array of positive integers, find the smallest subarray’s length whose sum of elements is
greater than a given number K.
        For Example:
        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 20
        Output: The smallest subarray length is 3
        Explanation: The smallest subarray with sum > 20 is {6, 7, 8}

        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 7
        Output: The smallest subarray length is 1
        Explanation: The smallest subarray with sum > 7 is {8}

        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 21
        Output: The smallest subarray length is 4
        Explanation: The smallest subarray with sum > 21 is {4, 5, 6, 7}

        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 40
        Output: No subarray exists

*/

import java.util.Arrays;

public class CodeChallenge_2607 {

    private static void findSmallestBySortedArray(int[] array, int k){
        int sum=0,length=Integer.MAX_VALUE,n=1;
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--){

            System.out.println("i=> "+i);
            sum += array[i];
            if(sum >= k){
                System.out.println("Length is : "+ n);
                break;
            }
           n++;
        }
        if(n > array.length){
            System.out.println("Not found "+n);
        }

    }

    private static void findSmallestLength(int[] array, int K) {
        int n = array.length;
        int length = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            System.out.println("i=> "+i);
            int sum = 0;
            for(int j=i;j<n; j++) {

                sum += array[j];
                System.out.println("Sum : " +sum);
                if(sum >= K) {
                    length = Math.min(length, j-i+1);
                    System.out.println("Length : "+ length+ " current length : "+(j-i+1));
                    break;
                }
            }
        }

        System.out.println("Length : "+length);
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 40;
//        findSmallestLength(array,k);
        findSmallestBySortedArray(array,k);
    }
}
