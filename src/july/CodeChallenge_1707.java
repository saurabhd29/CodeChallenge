package july;/*
Given a rod of length n and a list of rod prices of length i, where 1 <= i <= n, find the optimal way to cut the rod
into smaller rods to maximize profit.
        For example, consider the following rod lengths and values:
        Input:

        length[] = [1, 2, 3, 4, 5, 6, 7, 8]
        price[] = [1, 5, 8, 9, 10, 17, 17, 20]

        Rod length: 4

        Best: Cut the rod into two pieces of length 2 each to gain revenue of 5 + 5 = 10

        Cut           Profit
        4                9
        1, 3            (1 + 8) = 9
        2, 2            (5 + 5) = 10
        3, 1            (8 + 1) = 9
        1, 1, 2         (1 + 1 + 5) = 7
        1, 2, 1         (1 + 5 + 1) = 7
        2, 1, 1         (5 + 1 + 1) = 7
        1, 1, 1, 1      (1 + 1 + 1 + 1) = 4
*/

import java.util.Arrays;
import java.util.Scanner;

public class CodeChallenge_1707 {
    static int findMax(int n1,int n2){
        if(n1>=n2){
            return n1;
        }
        else {
            return n2;
        }
    }
    public static int findBestCutPrice(int pieces){
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int max=0;
        int[] priceListMax = new int[pieces+1];

        for (int i = 1; i <= pieces; i++) {
            System.out.println("i => "+i);
            for (int j = 0; j < i; j++) {
                max = findMax(max, price[j] + priceListMax[i - j - 1]);
                System.out.println("price : "+price[j]+ " priceListMax : "+ priceListMax[i-j-1]+ " maxval : "+ max);
            }
            priceListMax[i] = max;
        }
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(priceListMax));
        return max;
    }
    public static void main(String[] args) {

        System.out.println("Enter length of rod : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Max Profit "+findBestCutPrice(n));
    }
}
