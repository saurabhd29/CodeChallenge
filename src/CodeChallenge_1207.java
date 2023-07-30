public class CodeChallenge_1207 {

    public static int getMaximumDifference(int[] array)
    {
        int diff =0;

        if (array.length == 0) {
            return diff;
        }

        for (int i=0; i<array.length-1; i++)
        {
            for (int j=i+1; j<array.length;j++) {
                if (array[j] > array[i]) {
                    diff = Integer.max(diff, array[j] - array[i]);
                }
            }
        }
        return diff;
    }

    public static void main(String[] args)
    {
        int[] array = { 2, 7, 9, 5, 1, 3, 5 };

        System.out.println("Max Diff: "+getMaximumDifference(array));

    }
}
