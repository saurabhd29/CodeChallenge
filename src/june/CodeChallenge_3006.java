package june;/*
Print all subarrays with 0 sum
        Given an integer array, print all subarrays with zero-sum.
        For  example:
        Input:  { 4, 2, -3, -1, 0, 4 }

        Subarrays with zero-sum are

        { -3, -1, 0, 4 }
        { 0 }

        Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

        Subarrays with zero-sum are

        { 3, 4, -7 }
        { 4, -7, 3 }
        { -7, 3, 1, 3 }
        { 3, 1, -4 }
        { 3, 1, 3, 1, -4, -2, -2 }
        { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
*/

import java.util.*;

public class CodeChallenge_3006 {

    public static void main(String[] args) {
        int[] array = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
//        int[] array = {4, 2, -3, -1, 0, 4 };
        int n = array.length;
        findZeroSum1(array, n);
    }

    private static void findZeroSum1(int[] array, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += array[j];
//                System.out.println(array[j]+ ", Sum : "+ sum);
                if (sum == 0) {
//                    System.out.println("Inside");
                    for (int k = i; k <= j; k++) {
                        arrayList.add(array[k]);
                    }
                    for (int num : arrayList) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    arrayList.clear();
                }
            }
//            System.out.println("break");
            sum = 0;
        }
    }

    private static void findZeroSum(int[] array, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum=0;
        for (int i=0; i<n;i++){

            for (int j=i;j<n;j++){
                sum +=array[j];
                System.out.println(array[j]+ ", Sum : "+ sum);
                if(sum == 0){
                    System.out.println("Inside");
                    for (int k=i; k<=j;k++) {
                        arrayList.add(array[k]);
                    }
                    for(int num: arrayList){
                        System.out.print(num+" ");
                    }
                    map.put(i,arrayList);
                    System.out.println();
                    arrayList.clear();
                }
            }
            System.out.println("break");
            sum=0;
        }
        /*for(Map.Entry<Integer, List<Integer>> e : map.entrySet()){
            System.out.println(e.getValue());
//            for (Integer e1 : e.getValue())
        }*/
    }
}
