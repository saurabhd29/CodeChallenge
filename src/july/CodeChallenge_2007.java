package july;/*
Given a sorted array of distinct positive integers, print all triplets that forms an arithmetic progression with an integral common difference.
        An arithmetic progression is a sequence of numbers such that the difference between the consecutive terms is constant. For instance, sequence 5, 7, 9, 11, 13, 15, … is an arithmetic progression with a common difference of 2.
        For Example:
        Input:  A[] = { 5, 8, 9, 11, 12, 15 }

        Output:
        5 8 11
        9 12 15


        Input:  A[] = { 1, 3, 5, 6, 8, 9, 15 }

        Output:
        1 3 5
        1 5 9
        3 6 9
        1 8 15
        3 9 15
*/


public class CodeChallenge_2007 {

    public static void findT(int[] array)
    {

        for (int i=1; i<array.length-1; i++)
        {
            int a=i-1, b=i+1;
            System.out.println("i => "+ i );
            while (a>=0 && b<array.length)
            {
                System.out.println("a => "+a+" b=> "+b);
                if (array[a]+array[b]==2*array[i])
                {
                    System.out.println(array[a] + " " + array[i] + " " + array[b]);
                    b++; a--; }
                else if (array[a]+array[b]<2*array[i]) {
                    b++; }
                else { a--;
                }

            }
        }
    }

    public static void main(String[] args)
    {
        int[] array = { 1, 3, 5, 6, 8, 9, 15 };

        findT(array);
    }
}
