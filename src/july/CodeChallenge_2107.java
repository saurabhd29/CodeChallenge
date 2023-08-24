package july;/*
Given an array of pairs of integers, find all symmetric pairs, i.e., pairs that mirror each other. For instance, pairs (x, y) and (y, x) are mirrors of each other.
        For example:
        Input:  {3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}

        Output:

        {4, 3} | {3, 4}
        {2, 5} | {5, 2}
*/


import java.util.Arrays;
import java.util.HashSet;

class CodeChallenge_2107 {

     static void findPairs(int[][] array){

         for(int i=0;i<array.length;i++){
             for(int j=0; j<array.length;j++){
//                System.out.println(Arrays.toString(array[i]));
//
//                System.out.println(Arrays.toString(array[j]));
//                System.out.println("***");
                if(array[i][0] == array[j][1] && array[i][1] == array[j][0]){
                 System.out.println("Pairs : "+array[i][0] +" , "+ array[i][1]+
                         " || "+array[j][0] +" , "+ array[j][1]);
                }
//                System.out.println(array[i][0]);
//                System.out.println(array[i][1]);
             }
         }
     }

     static void findPairsBySet(int[][] array){
         HashSet<String> set = new HashSet<>();
         for(int i=0; i< array.length;i++){
            String s = Arrays.toString(array[i]);
            set.add(s);
            String rev = "["+array[i][1]+", "+array[i][0]+"]";
//            System.out.println(rev);
             if(set.contains(rev)){
                 System.out.println(Arrays.toString(array[i])+" || "+rev);
             }
        }
//         System.out.println(set);

     }

    public static void main(String[] args) {
     int[][] array = {{3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}};
     findPairs(array);
     findPairsBySet(array);
    }
}
