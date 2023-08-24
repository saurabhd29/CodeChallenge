package august;/*
Given an array of distinct integers, shuffle it according to the given order of elements.
        For example:
        Input:
        nums[] = { 1, 2, 3, 4, 5 }
        pos[] = { 3, 2, 4, 1, 0 }

        Output:

        nums[] = { 5, 4, 2, 1, 3 }
        (pos[i] != i)
        i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
        In other words, update nums[pos[i]] = nums[i] for every index i.
*/


import java.util.Arrays;

public class CodeChallenge_0308 {
//System.out.println("nums i "+nums[i]+" nums j "+nums[j]);
    static void findDistinct(int[] nums, int[] pos){
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(pos[i]== j){
                    array[j] = nums[i];
                }
            }
        }
//        nums = array.clone();
        nums = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(nums));
    }
    static int k=1;
    public static void swap(int[] nums, int i, int j){

        int data = nums[i];
        nums[i] = nums[j];
        nums[j] = data;

        if(k%2==1)
            System.out.println("nums"+ Arrays.toString(nums));
        else
            System.out.println("pos"+ Arrays.toString(nums));
        k++;
    }

    static void findDistinct1(int[] nums, int[] pos){
        for (int i=0; i<nums.length; i++){
            while (pos[i] != i) {
                System.out.println("i "+pos[i]+" j "+i);
                swap(nums, pos[i], i);
                swap(pos, pos[i], i);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };

        findDistinct1(nums,pos);
    }

}
