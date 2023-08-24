package august;/*
Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M.
If there are more than one such number, then output the one having maximum absolute value.


        Example 1:

        Input:
        N = 13 , M = 4
        Output:
        12
        Explanation:
        12 is the Closest Number to
        13 which is divisible by 4.
        Example 2:

        Input:
        N = -15 , M = 6
        Output:
        -18
        Explanation:
        -12 and -18 are both similarly close to
        -15 and divisible by 6. but -18 has
        the maximum absolute value.
        So, Output is -18
*/

public class CodeChallenge_2108 {
    private static void findClosestNumber(int n, int m) {
        int num = n;

        while(num%m!=0){
            num--;
        }
        int temp = num;
        num=n;

        while(num%m!=0){
            num++;
        }
//        System.out.println("temp "+temp+" num "+num);
        if((temp-n)>(num-n)){
            System.out.println(num);
        }else {
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        findClosestNumber(-15,6);
    }


}
