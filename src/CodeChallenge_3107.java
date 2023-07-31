/*
Given an unsorted integer array containing many duplicate elements,
rearrange it such that the same element appears together and
the relative order of the first occurrence of each element remains unchanged.
        For example:
        Input:  { 1, 2, 3, 1, 2, 1 }
        Output: { 1, 1, 1, 2, 2, 3 }


        Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
        Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CodeChallenge_3107 {

    static void rearrange(int[] array){
//        int[] sortedArray = new int[array.length];
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                continue;
            }
            for(int j=0;j<array.length; j++){
                if( array[i] == array[j]){
                    list.add(array[i]);
                    set.add(array[i]);
                }
            }
        }
        System.out.println(list);
    }
    private static void rearrange1(int[] array) {

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 2, 1 };

        rearrange1(array);
    }




}
