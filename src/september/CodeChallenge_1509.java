package september;
/*Given an array arr[] of size N, check if it can be partitioned into two parts such
that the sum of elements in both parts is the same.

        Example 1:

        Input: N = 4
        arr = {1, 5, 11, 5}
        Output: YES
        Explanation:
        The two parts are {1, 5, 5} and {11}.
        Example 2:

        Input: N = 3
        arr = {1, 3, 5}
        Output: NO
        Explanation: This array can never be
        partitioned into two such parts.*/
public class CodeChallenge_1509 {

    public static void main(String[] args) {
        int n=4;
        int[] array = {1,5,11,5};

        isPartitioned(n,array);
    }

    private static void isPartitioned(int n, int[] array) {
        boolean flag=false;
        for(int i=0;i<n;i++){
            int value= array[i];
            int sum=0;
            for(int j=0; j<n;j++){
                if (i == j) {
                    continue;
                }
                sum+=array[j];
            }
            if(sum == value){
                flag=true;
            }
        }
        if(flag){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
