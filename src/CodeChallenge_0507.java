/*
Merge two arrays by satisfying given constraints
        Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
        Input:

        X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
        Y[] = { 1, 8, 9, 10, 15 }

        The vacant cells in X[] is represented by 0

        Output:

        X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
*/

import java.util.Iterator;
import java.util.TreeSet;

public class CodeChallenge_0507 {


    public static void main(String[] args) {
        int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int Y[] = { 1, 8, 9, 10, 15 };

        mergeArrays(X,Y);
    }

    private static void mergeArrays(int[] X, int[] Y) {
        TreeSet<Integer> set = new TreeSet<>();
        int j=0;
        for(int i=0; i< X.length;++i){
            if (X[i]!=0){
                set.add(X[i]);
            }
            else {
                set.add(Y[j++]);
            }
        }
        Iterator<Integer> i = set.iterator();
        while(i.hasNext())
            System.out.print(i.next()+ " ");
    }

}
