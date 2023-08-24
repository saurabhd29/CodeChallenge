package july;/*
Find the smallest window in an array sorting which will make the entire array sorted
        Given an integer array, find the smallest window sorting which will make the entire array sorted
        in increasing order.
        For example:
        Input:  { 1, 2, 3, 7, 5, 6, 4, 8 }
        Output: Sort the array from index 3 to 6

        Input:  { 1, 3, 2, 7, 5, 6, 4, 8 }
        Output: Sort the array from index 1 to 6

*/

public class CodeChallenge_2707 {

    static void findSubArrayIndex(int[] array){
        int start = 0;
        int maxIndex=0;
        int minIndex =0;

        for (int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1]) {
                start= i;
                break;
            }
        }
        System.out.println("start "+start);
        int end=0;
        for (int j=array.length-1; j > 0; j--) {
            if(array[j-1] > array[j]) {
                end=j;
                break;
            }
        }
        System.out.println("end "+end);
        int max= array[start];
        int min= array[start];
        for (int i=start+1; i<=end; i++) {
            if(max<array[i]) {
                max=array[i];
            }if(min >array[i]) {
                min =array[i];
            }
        }
        System.out.println("min "+min+" max "+max);
        for(int i=0; i<start; i++) {
            if(min<array[i]) {
                minIndex= i;
            }
            else if (i==start-1){
                minIndex=start;
            }
        }

        for(int i = array.length-1; i > end; i--) {
            if(max > array[i]) {
                maxIndex= i;
            }
            else if (i==end+1){
                maxIndex=end;
            }
        }

        System.out.println("Sorted from "+ minIndex + " to "+ maxIndex);
    }


    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 7, 5, 6, 4, 8 };

        findSubArrayIndex(array);
    }
}
