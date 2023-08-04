/*
Write code to print all combinations of positive integers in
increasing order that sum to a given positive number.

        For Example:
        Input:  N = 3

        1 1 1
        1 2
        3

        Input:  N = 4

        1 1 1 1
        1 1 2
        1 3
        2 2
        4

        Input:  N = 5

        1 1 1 1 1
        1 1 1 2
        1 1 3
        1 2 2
        1 4
        2 3
        5
*/

import java.util.Arrays;

public class CodeChallenge_0208 {
    static int j=0;
    static void findCombo(int array[], int index, int target, int decFactor) {
        System.out.println();
        if (decFactor < 0)
            return;
        if(index!=0)
            System.out.println("index "+index+ " array ind "+ array[index-1]);
        if (decFactor == 0)
        {
            for (int i = 0; i < index; i++)
                System.out.print (array[i] + " ");
            System.out.println();
            return;
        }

        int prev = (index == 0) ?
                1 : array[index - 1];
        System.out.println("prev "+prev);

        System.out.println("Array "+ Arrays.toString(array));
        for (int k = prev; k <= target ; k++)
        {
            System.out.println("Iteration "+ j++);
            System.out.println("arr[index] "+ k);
            array[index] = k;
            System.out.println("Recursion  index "+(index+1)+ " target "+target+ " reduced num "+ (decFactor-k));
            findCombo(array, index + 1, target, decFactor - k);
        }
    }
    public static void main(String[] args) {
        int target = 4;
        int[] array = new int[target];
        findCombo(array,0,target,target);
    }
}
