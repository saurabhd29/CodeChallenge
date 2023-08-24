package august;/*
Given an integer array, trim it such that its maximum element becomes less than twice the minimum,
return the minimum number of removals required for the conversion.
        For example,
        Input:  [4, 6, 1, 7, 5, 9, 2]
        Output: The minimum number of removals is 4
        The trimmed array is [7, 5, 9] where 9 < 2 × 5.

        Input:  [4, 2, 6, 4, 9]
        Output: The minimum number of removals is 3
        The trimmed array is [6, 4] where 6 < 2 × 4.
*/

import java.util.ArrayList;
import java.util.List;

public class CodeChallenge_0808 {
    //[4, 6, 1, 7, 5, 9, 2]
    private static void findMinRemoval(int[] array) {
        int max=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        int length=0;
        for(int i=0;i<array.length; i++){
            if(array[i]<max){
                continue;
            }
            max=array[i];
            System.out.println("i => "+i+" max = "+max);
            for(int j=0;j<array.length;j++){
                if(i==j){
                    continue;
                }
                if(array[j]*2>max ){
                    if(minDiff == (array[j]*2-max)){
                        list.clear();
                        list.add(i);
                        list.add(j);
                        System.out.print("Same diff ");
                        System.out.println("Max "+max+" arr"+(array[j]*2)+" minDiff "+minDiff);
                    }
                    else if(minDiff > (array[j]*2-max)){
                        list.clear();
                        list.add(i);
                        list.add(j);
                        minDiff = Integer.min((array[j] * 2 - max), minDiff);
//                    minDiff = (array[j]*2-max);
                        System.out.println("Max " + max + " arr " + (array[j] * 2) + " minDiff " + minDiff);
                    }
                    else {
                        continue;
                    }
                }
            }
        }
        System.out.println(list);
        int minIndex = Integer.min(list.get(0),list.get(1));

        int minElement = Integer.min(array[list.get(0)],array[list.get(1)]);
        int sideElements = array[minIndex-1];
        while(minElement<= sideElements){
            minIndex--;
            if(minElement>=0)
                sideElements= array[minIndex-1];
            else {
                minIndex++;
                break;
            }
        }
        int maxIndex = Integer.max(list.get(0),list.get(1));
        int maxElement = Integer.max(array[list.get(0)],array[list.get(1)]);
        sideElements = array[maxIndex+1];
        System.out.println("se " +sideElements);
        System.out.println("min "+ minElement+ " arr "+ array[maxIndex]);
        while (minElement<=sideElements && maxElement>=sideElements){
            maxIndex++;
            if(maxIndex<array.length)
                sideElements=array[minIndex+1];
            else {
                maxIndex--;
                break;
            }
        }
        System.out.println("min "+minIndex+" max "+maxIndex);

        int elementDiff = maxIndex - minIndex + 1;
        System.out.println("The minimum number of removals is "+ (array.length - elementDiff));
        for (int i= minIndex; i<=maxIndex; i++){
            System.out.print(array[i]+" ");
        }

    }
    public static void main(String[] args) {
//        int[] array = {4, 6, 1, 7, 5, 9, 2};
        int[] array ={4, 2, 6, 4, 9};
        findMinRemoval(array);
    }


}
