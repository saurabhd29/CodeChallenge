/*
Given a number N. Count the number of digits in N which evenly divides N.

        Note :- Evenly divides means whether N is divisible by a digit
         i.e. leaves a remainder 0 when divided.

        Example 1:

        Input:
        N = 12
        Output:
        2
        Explanation:
        1, 2 both divide 12 evenly
        Example 2:

        Input:
        N = 23
        Output
        0
        Explanation:
        2 and 3, none of them
        divide 23 evenly

*/

import java.util.Scanner;

    public class CodeChallenge_1008 {

    private static void countDivisibleDigits(int n) {
        int count =0;
        int num =n;
        //12
        while(num>0){
            int temp =num%10;
            System.out.println("temp "+temp);
            if(n % temp  == 0){
                count++;
            }
            num=num/10;
            System.out.println("num "+num);
        }
        System.out.println("Count "+count);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        countDivisibleDigits(n);
    }


}
