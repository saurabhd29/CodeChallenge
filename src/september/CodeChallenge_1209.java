package september;

import java.util.Arrays;

/*Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array.
It is given that all array elements are distinct.

        Note :-  l and r denotes the starting and ending index of the array.

        Example 1:

        Input:
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given
        array is 7.
        Example 2:

        Input:
        N = 5
        arr[] = 7 10 4 20 15
        K = 4
        Output : 15
        Explanation :
        4th smallest element in the given
        array is 15.*/
public class CodeChallenge_1209 {

    public static void main(String[] args) {
        int[] array = {7 ,10 ,4 ,20, 15};
        int[] array1 ={7, 10 ,4, 3 ,20, 15};
        int k=3;
        int n= array.length;

        findKthElement1(array1,k,n);
    }

    private static void findKthElement1(int[] array, int k, int n) {
        Arrays.stream(array).sorted().limit(k).max().ifPresent(System.out::println);
    }

    private static void findKthElement(int[] array, int k, int n) {
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
}
