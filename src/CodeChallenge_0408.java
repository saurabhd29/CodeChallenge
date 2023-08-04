/*
Given an integer array, determine whether it can be divided into pairs such that the sum of elements
in each pair is divisible by a given positive integer k.
        For Example
        Input:
        arr[] = { 3, 1, 2, 6, 9, 4 }
        k = 5

        Output: Pairs can be formed

        Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.


        Input:
        arr[] = { 2, 9, 4, 1, 3, 5 }
        k = 6

        Output: Pairs can be formed

        Explanation: Array can be divided into pairs {(2, 4), (9, 3), (1, 5)} where the sum of elements in each pair is divisible by 6.


        Input:
        arr[] = { 3, 1, 2, 6, 9, 4 }
        k = 6

        Output: Pairs cannot be formed

        Explanation: Array cannot be divided into pairs where the sum of elements in each pair is divisible by 6.
*/


import java.util.HashSet;
import java.util.Set;

public class CodeChallenge_0408 {
    private static void findDivisiblePairs(int[] array , int k) {
        boolean flag = false;

        Set<String> set = new HashSet<>();

        for(int i=0;i<array.length; i++){
            for(int j=0;j<array.length; j++){
                String revStr = "["+array[j]+","+array[i]+"]";
                if(i!=j && (array[i]+array[j]) % k ==0 && !set.contains(revStr)){
                    String str = "["+array[i]+","+array[j]+"]";
                    System.out.println(str);
                    flag = true;
                    set.add(str);
                }
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
        else {
            System.out.println("Pairs found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 6, 9, 4 };
        int k =5;
        findDivisiblePairs(arr,k);
    }


}
