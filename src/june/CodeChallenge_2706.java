package june;/*Find a pair with the given sum in an array.
        Given an unsorted integer array, find a pair with the given sum in it.
        For Example:
        Input:
        nums = [8, 7, 2, 5, 3, 1]
        target = 10

        Output:
        Pair found (8, 2)
        or
        Pair found (7, 3)

        Input:
        nums = [5, 2, 6, 8, 1, 9]
        target = 12

        Output: Pair not found*/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CodeChallenge_2706 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        int[] array = {5, 2, 3, 6, 8, 1, 9, 7};
        int n = 12;

        findPairs1(array,n);
//        findPairsUsingSoring(array,n);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
//        System.out.println(endTime+ " "+ startTime);
        System.out.println("Time taken to execute : "+ elapsedTime/1000+ " micro secs");
    }

    private static void findPairs1(int[] array, int n) {
        Arrays.sort(array);

        boolean found=false;
        for(int i=0;i<array.length/2;++i){
            for(int j=array.length-1;j>=i;--j){
                if(i!=j && array[i]+array[j]==n){

                    System.out.println("Pair found ("+ array[i] + " " + array[j] + ")");
                    found=true;
                }
            }
            if(found && i==array.length/2-1){
                return;
            }
        }
        System.out.println("Not found");
    }

    private static void findPairsUsingSoring(int[] array, int n) {
        Arrays.sort(array);
        int max=array.length-1,min=0;
        while (max>min){
            if(array[max]+array[min]==n){
                System.out.println("Pair found ("+ array[min++] + " " + array[max--] + ")");

            }
            else if(array[max]+array[min]>n){
//                System.out.println("Max : "+ array[max]+array[min]);
                max--;
            }
            else {
//                System.out.println("Min : "+array[max]+array[min]);
                min++;
            }
        }
    }

    private static void findPairs(int[] array, int n) {
        LinkedHashSet set = new LinkedHashSet();
        boolean found=false;
        for(int i=0;i<array.length;++i){
            for(int j=0;j<array.length;++j){
                if(i!=j && array[i]+array[j]==n){
                    if(set.contains(array[i]) && set.contains(array[j])){
                        continue;
                    }
                    set.add(array[i]);
                    set.add(array[j]);
                    System.out.println("Pair found ("+ array[i] + " " + array[j] + ")");
                    found=true;
                }
            }
            if(found && i==array.length-1){
                return;
            }
        }
        System.out.println("Not found");
    }


}
