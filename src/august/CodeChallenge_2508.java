package august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array of positive and negative integers, segregate them in linear time and constant space.
 The output should print all negative numbers, followed by all positive numbers.
        For example:
        Input:  [9, -3, 5, -2, -8, -6, 1, 3]
        Output: [-3, -2, -8, -6, 5, 9, 1, 3]*/
public class CodeChallenge_2508 {
    static void swap(int[] array, int index, int position){
        array[index] = array[index] + array[position];
        array[position] = array[index] - array[position];
        array[index] = array[index] - array[position];
    }

    private static void segregate(int[] array) {
        List<Integer> list = new ArrayList<>();
        int sort=0;
        int n = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                array[sort++]= array[i];
            }else{
                list.add(array[i]);
            }
        }
        System.out.println(list);
        for(int i=sort;i< array.length;i++){
            array[i] = list.get(n++);
        }

        System.out.println(Arrays.toString(array));
    }

    private static void segregate1(int[] array) {
        int position=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                System.out.println("Swap "+ array[i]+" index "+i+" pos "+ position);
                swap(array,i,position++);
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array ={9, -3, 5, -2, -8, -6, 1, 3};
        System.out.println(Arrays.toString(array));
        segregate1(array);
    }

}
