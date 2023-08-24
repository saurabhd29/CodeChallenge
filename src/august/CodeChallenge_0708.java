package august;/*
Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
        For example,
        Input:  {1, 2, 3}, k = 2
        Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}

        Input:  {1, 2, 3, 4}, k = 2
        Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}

        Input:  {1, 2, 1}, k = 2
        Output: {1, 1}, {1, 2}, {2, 2}

*/

public class CodeChallenge_0708 {

    private static void findCombinations(int[] array, int k) {
        for(int i=0; i< array.length;i++){
            for(int j=i;j< array.length; j++){
                int m=0;
                if(k>m++){
                    System.out.print("{"+array[i]+","+array[j]+"} ");
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] array= {1, 2, 3};
        int k=2;
        findCombinations(array,k);
    }


}
