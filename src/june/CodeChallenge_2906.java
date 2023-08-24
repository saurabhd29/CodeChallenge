package june;/*  Replace every array element with the product of every other element
        Given an integer array, replace each element with the product of every other element without using the division operator.
        For example:
        Input:  { 1, 2, 3, 4, 5 }
        Output: { 120, 60, 40, 30, 24 }

        Input:  { 5, 3, 4, 2, 6, 8 }
        Output: { 1152, 1920, 1440, 2880, 960, 720 }*/

public class CodeChallenge_2906 {

    public static void main(String[] args){
        int[] array = { 1,2,3,4,5};
//        int[] array = { 5, 3, 4, 2, 6, 8 };

        findSumAndProduct(array);
//        System.out.println(Arrays.toString(findSumAndProduct1(array)));;
    }



    private static int[] findSumAndProduct1(int[] array) {
        int[] leftProductArray = new int[array.length];
        int[] rightProductArray = new int[array.length];
        int n = array.length;
        leftProductArray[0]=1;
        rightProductArray[n-1]=1;
        for (int i=1;i<n;++i){
            leftProductArray[i] = leftProductArray[i-1] * array[i-1];
            rightProductArray[n-i-1] = rightProductArray[n-i] * array[n-i];
        }
        /*for(int i=0;i<n;++i){
            System.out.print(leftProductArray[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<n;++i){
            System.out.print(rightProductArray[i]+ " ");
        }*/
        for (int i=0;i<n;++i){
            array[i] = leftProductArray[i] * rightProductArray[i];
//            System.out.println(array[i]);
        }
        return array;
    }

    private static void findSumAndProduct(int[] array) {
        int[] leftProductArray = new int[array.length];
        int[] rightProductArray = new int[array.length];
        int i=0;
        leftProductArray[0] = 1;
        for(int n: array){
            if(i==array.length-1){
                break;
            }
            leftProductArray[++i] = leftProductArray[i-1] * n;
//            System.out.print(leftProductArray[i]+" ");
        }
        rightProductArray[array.length-1] = 1;
        for (int j=array.length-2;j>=0;j--){
            rightProductArray[j]= rightProductArray[j+1] * array[j+1];
//            System.out.print(rightProductArray[j]+" ");
        }
        for (int k=0; k<array.length;k++){
//            System.out.println(leftProductArray[k] + " " + rightProductArray[k]);
            array[k]= leftProductArray[k] * rightProductArray[k];
            System.out.print(array[k]+" ");
        }


    }
}
