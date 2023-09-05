package september;

import java.util.Arrays;

/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

        Note: If at any instance, there are no more subarrays of size greater than or equal to K,
        then reverse the last subarray (irrespective of its size). You shouldn't return any array,
        modify the given array in-place.

        Example 1:

        Input:
        N = 5, K = 3
        arr[] = {1,2,3,4,5}
        Output: 3 2 1 5 4
        Explanation: First group consists of elements
        1, 2, 3. Second group consists of 4,5.


        Example 2:

        Input:
        N = 4, K = 3
        arr[] = {5,6,8,9}
        Output: 8 6 5 9


        Example 3:

        Input:
        N = 10, K = 3
        arr[] = {1,2,3,4,5,6,7,8,9,10}
        Output: 3 2 1 6 5 4 9 8 7 10
        Explanation: First group consists of elements
        1, 2, 3. Second group consists of 4,5,6. Third Group consist of 7,8,9 and the last group had only 10.*/
public class CodeChallenge_0209 {

    private static void findSorted(int[] array, int k) {

        int[] descArray = new int[array.length];
        for(int i=0; i<array.length;i+=k){
//            System.out.println(i);

            int start=i;
            int end=i+k-1;

            int count=0;
            while(count<k){
                if(end>=array.length){
                    end=array.length-1;
                    count=k-(end-start)-1;
                    System.out.println("start "+start+" end"+end+" count "+count);
                }
                descArray[start] = array[end];
                count++;
                start++;
                end--;
                System.out.println("start "+start+" end"+end);
            }

           /* for(int j=i;j<i+k;j++){
                if(j>=array.length){
                    break;
                }
                descArray[j]=array[j];

                System.out.print(array[j]+" ");
            }*/
            System.out.println();
        }
        System.out.println("Rev Sub Array "+Arrays.toString(descArray));
    }
    static int[] array;
    public static void main(String[] args) {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 ={1,2,3,4,5};
        int k=3;

//        findSorted(array,k);
        findReverseSubArray(array,k);
    }

    private static void findReverseSubArray(int[] array, int k) {
        int i=0;
        while (i< array.length){
            System.out.println(i);
            if(i+k > array.length){
                reverse(array,i, array.length-1);
                break;
            }
            reverse(array,i,i+k-1);
            i+=k;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] reverse(int[] array, int start, int end){
       System.out.println("start "+start+ " end "+end);
        while(start<=end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++; end--;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


}
