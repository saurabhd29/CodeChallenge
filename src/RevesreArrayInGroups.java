// User function Template for Java

import java.util.ArrayList;
import java.util.Collections;

class RevesreArrayInGroups {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n =5, k=3;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left += 1;
                right -= 1;
            }
        }
        for(int num : arr){
            System.out.print(num);
        }

    }

    static int gcd(int n1, int n2){
        System.out.println("n1 "+n1+ " n2 "+n2);
        if(n1==0){
            return n2;
        }
        //return gcd(n2, n1%n2);
        return gcd(n2%n1,n1);
    }
}