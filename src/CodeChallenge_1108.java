/*
Given a non-negative integer n, print the first n rows of Pascal’s triangle.
        Each number in Pascal’s triangle is constructed by adding the two numbers diagonally above,
        where blank entries being interpreted as 0.
        For instance, the first eight rows of Pascal’s triangle are depicted in the diagram below.


        For Example:
        Input: n = 3
        Output: [[1], [1, 1], [1, 2, 1]]

        Input: n = 5
        Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeChallenge_1108 {
    private static void pascalsTraingle(int n) {

        for(int i=0;i<n;i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            int x =1;
            for(int j=0;j<=i;j++){
                System.out.print(x+" ");
                x=x*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    private static void pascalsTraingle1(int n) {


    }
    public static void main(String[] args) {
        int n=7;

        pascalsTraingle1(n);
    }

}
