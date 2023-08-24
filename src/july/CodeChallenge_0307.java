package july;/*
Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
For Example:
Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }

Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }
 */

import java.util.Arrays;

public class CodeChallenge_0307 {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
//        swap(new int[]{3,5},0,1);
        sortArray(array);
        System.out.println(Arrays.toString(array));

//        executeString(null);
    }

    private static void executeString(Object o) {
        System.out.println("Object");
    }
    private static void executeString(String s) {
        System.out.println("String");
    }


    public static void sortArray(int[] array)
    {
        int first = 0, n = 0,pivot = 1; //middle
        int last = array.length - 1;

        while (n <= last)
        {
            if (array[n] > pivot)//for 2
            {
                swap(array, n, last--);
//                System.out.println("for 2 :: "+n+" Last Updated : "+ last+" "+array[n]+" "+array[last]);
            }
            else if (array[n] < pivot)//for 0
            {
                swap(array, first++, n++);

//                System.out.println("for 0 :: "+n+" First Updated : "+ first+" "+array[n]+" "+array[last]);
            }
            else {  //1=1
                n++;
//                System.out.println("n :: "+n);
            }
        }
    }

    private static void swap(int[] array, int i, int j)
    {
        array[i] = array[i]+ array[j];
        array[j] = array[i]- array[j];
        array[i] = array[i]- array[j];
    }

}
