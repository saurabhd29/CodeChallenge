package september;
/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.



        Example 1:

        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
        2 is the missing number in the range since it does not appear in nums.
        Example 2:

        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
        2 is the missing number in the range since it does not appear in nums.
        Example 3:

        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
        8 is the missing number in the range since it does not appear in nums.
*/


import java.util.Arrays;
import java.util.List;

public class CodeChallenge_0609 {

    public static void main(String[] args) {
        int[] array = {9,6,4,2,3,5,7,0,1};

        findMissingNumber(array);

    }

    private static void findMissingNumber(int[] array) {
        int n =array.length;
        int max = findMaximum(array);
        boolean flag = false;
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(array[i]!=i && array[i]!=n){
                System.out.println(i);
            }
            else if(array[i] == n){
                flag = true;
            }
        }
        if(!flag){
            System.out.println(array.length);
        }
    }

    private static int findMaximum(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
