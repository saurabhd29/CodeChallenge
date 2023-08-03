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

import java.util.*;

public class CodeChallenge_3107 {
    //        int[] array = { 1, 2, 3, 1, 2, 1 };
    static void rearrange(int[] array){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(list.contains(array[i])){
                continue;
            }
            for(int j=0;j<array.length; j++){
                if( array[i] == array[j]){
                    list.add(array[i]);
                }
            }
        }
        System.out.println(list);
    }
    private static void rearrange1(int[] array) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<array.length; i++){

            if(map.containsKey(array[i])){
                map.replace(array[i],map.get(array[i]).intValue()+1);
                System.out.println("Updated value of "+array[i]+" is "+map.get(array[i]));
            }else {
                map.put(array[i],1);
                System.out.println("Put "+array[i]);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> n : map.entrySet()){
            for(int num=0;num<n.getValue();num++){
                System.out.print(n.getKey()+" ");
            }
        }
    }

    public static void main(String[] args) {
//        int[] array = { 1, 2, 3, 1, 2, 1 };
        int[] array = { 5, 4, 5, 5, 3, 1, 2, 2, 4 };
        rearrange1(array);
    }
}
