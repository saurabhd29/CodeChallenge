package july;/*
Find the largest subarray having an equal number of 0’s and 1’s
        Given a binary array containing 0’s and 1’s, find the largest subarray with equal numbers of 0’s and 1’s.
        For Example:
        Input:  { 0, 0, 1, 0, 1, 0, 0 }

        Output: Largest subarray is { 0, 1, 0, 1 } or { 1, 0, 1, 0 }
*/

public class CodeChallenge_0707 {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 0, 1, 0, 0};
        largestSubarray(array);
//        System.out.println(largestSubarray(array));
    }

    private static void largestSubarray(int[] array) {
        int sum,start=0,end;
        int max = -1;



        for (int i = 0; i < array.length - 1; i++) {
            if(array[i]==0){
                sum=-1;
            }
            else {
                sum=0;
            }

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == 0)
                    sum += -1;
                else
                    sum += 1;

                if (sum == 0 && max<j-i+1) {
                    max = j-i+1;
                    start = i;
                }
            }
        }
        end =start+max-1;
        if (max == -1)
            System.out.println("No such subarray");
        else
            for(int i=start;i<=end;i++)
                System.out.print(array[i]+" ");
//            System.out.println(start + " to " + end);
    }
}
