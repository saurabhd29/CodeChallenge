package september;
/*Given an array Arr of N positive integers and another number X.
Determine whether or not there exist two elements in Arr whose sum is exactly X.

        Example 1:

        Input:
        N = 6, X = 16
        Arr[] = {1, 4, 45, 6, 10, 8}
        Output: Yes
        Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
        Example 2:

        Input:
        N = 5, X = 10
        Arr[] = {1, 2, 4, 3, 6}
        Output: Yes
        Explanation: Arr[2] + Arr[4] = 4 + 6 = 10*/
public class CodeChallenge_0709 {

    public static void main(String[] args) {

        int[] array =  {1, 4, 45, 6, 10, 8};
        int n=16;

        findTotal1(array,n);
    }

    private static void findTotal1(int[] array, int x) {

        for(int i=0,j=0;i<array.length;){
            if(i==j){
                continue;
            }
            if(array[i]<x || array[j]<x){
                if(array[i]+array[j]==x){
                    System.out.println("yes");
                    return;
                }
                j++;
                if(j == array.length){
                    i++;
                    j=i+1;
                }
            }
            else {
                i++;
                j=i+1;

            }


        }
        System.out.println("No");
    }

    private static void findTotal(int[] array, int n) {
        for(int i=0;i<array.length;i++){
            if(array[i]>n){
                continue;
            }
            for(int j=0;j<array.length;j++){
                if(i==j){
                    continue;
                }
                if(array[i]+array[j] == n){
                    System.out.println("yes");
                    return;
                }
            }
        }

    }
}
