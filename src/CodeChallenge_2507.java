/*
Find a subarray having the given sum in an integer array.
        For example:
        Input:  nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
        Output: {6, 0, 9}

        Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = 15
        Output: {1, -4, 7, 6, 1, 4} or {4, 1, 10}

        Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = -3
        Output: {1, -4} or {-7, 1, -4, 7}
*/


import java.util.ArrayList;

public class CodeChallenge_2507 {

    static void findSubArray(int[] array, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++){
//            System.out.println("i=>"+i+" sum init "+array[i]);
            int sum = array[i];
            list.add(array[i]);
            for(int j=i+1;j<array.length;j++){
                sum += array[j];
//                System.out.println("j=> "+j+" sum "+sum);
                list.add(array[j]);
                if(sum == target){
                    System.out.println(list);
                    list.clear();
                }
            }
            list.clear();
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int target = 15;

        findSubArray(nums,target);
    }
}
