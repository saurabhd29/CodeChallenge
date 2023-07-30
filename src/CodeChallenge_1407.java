/*
Find index of 0 to be replaced to get the maximum length sequence of continuous ones
        Given a binary array, find the index of 0 to be replaced with 1 to get the maximum length sequence of continuous ones.
        For example, consider the array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }.
        We need to replace index 7 to get the continuous sequence of length 6 containing all 1’s.
*/

public class CodeChallenge_1407 {

    public static int findIndex(int[] array)
    {
        int count=0,index=-1,lastZeroIndex=-1,countZeros=0;

        for (int i=0; i<array.length; i++)
        {
            System.out.println("i => "+i);
            if (array[i] == 0) {
                countZeros= i - lastZeroIndex;
                lastZeroIndex= i;

            }
            else {
                countZeros++;
                System.out.println("zero count "+countZeros);
            }
            if (countZeros>count)
            {
                count = countZeros;
                index = lastZeroIndex;
                System.out.println("count  "+count+" index  "+ index);
            }
        }
        System.out.println("Index "+ index);
        return index;
    }

    public static void main (String[] args)
    {
        int[] array = { 0, 1, 0,1};

        int index = findIndex(array);

        if (index == -1) {
            System.out.print("Not found");
        }
        else {
            System.out.print("Index needs to be replaced is :: " + index);
        }
    }

}
