package september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Lucky numbers are subset of integers. Rather than going into much theory,
let us see the process of arriving at lucky numbers,
        Take the set of integers
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
        First, delete every second number, we get following reduced set.
        1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
        Now, delete every third number, we get
        1, 3, 7, 9, 13, 15, 19,….….
        Continue this process indefinitely……
        Any number that does NOT get deleted due to above process is called “lucky”.

        You are given a number N, you need to tell whether the number is lucky or not.
        If the number is lucky return 1 otherwise 0.

        Example 1:

        Input:
        N = 5
        Output: 0
        Explanation: 5 is not a lucky number
        as it gets deleted in the second
        iteration.
        Example 2:

        Input:
        N = 19
        Output: 1
        Explanation: 19 is a lucky number because
        it does not get deleted throughout the process.*/
public class CodeChallenge_1109 {

    static List<Integer> list = new ArrayList<>();
    static int m=2;
    public static void main(String[] args) {
        int n=19;
//        findLuckyNumber(n);
        if(findLuckyNumber1(n)){
            System.out.println("Lucky");
        }else {
            System.out.println("Not Lucky");
        }
    }

    static int count=2;
    private static boolean findLuckyNumber1(int n) {
        if(n%count==0){
//            System.out.println("Not lucky");
            return false;
        }
        if(count>n){
            return true;
        }
        count++;
        return findLuckyNumber1(n-(n/count));


    }

    private static void findLuckyNumber(int n) {

        for(int i=1; i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
        while (list.get(list.size()-1)>=n && m<n){
            deleteOperation(list, n);
        }


        if(list.contains(n)){
            System.out.println("Lucky");
        }else {
            System.out.println("Not Lucky");
        }
    }

    private static void deleteOperation(List<Integer> list, int n) {
        int[] array = new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(array));
        for(int i=m;i<=array.length;i+=m){

                if(i>=n || i<2){
                    return;
                }
                array[i-1] = 0;
        }
        m++;
        System.out.println("red "+(m-1)+" "+Arrays.toString(array));
        list.clear();
        for(int num : array){
            if(num ==0){
                continue;
            }
            list.add(num);
        }
    }
}
