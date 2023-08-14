/*
Given a number N. Your task is to check whether it is fascinating or not.
        Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3,
        and when both these products are concatenated with the original number,
        then it results in all digits from 1 to 9 present exactly once.
        Example 1:

        Input:
        N = 192
        Output: Fascinating
        Explanation: After multiplication with 2
        and 3, and concatenating with original
        number, number will become 192384576
        which contains all digits from 1 to 9.
        Example 2:

        Input:
        N = 853
        Output: Not Fascinating
        Explanation: It's not a fascinating
        number.
*/

import java.util.*;

public class CodeChallenge_1408 {
    private static void checkIfFascinating(int n) {
        String[] numbers = {"1","2","3","4","5","6","7","8","9"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list,numbers);
        int num1 = n *1000 + n*2;
        int num2 = num1*1000 + n*3;
        Set<String> set = new TreeSet<>();
//        Set<Integer> number = new TreeSet<>(numbers);
        while(num2>0){
            int temp =num2%10;
            set.add(String.valueOf(temp));
            num2=num2/10;

        }
        if(set.containsAll(list)){
            System.out.println("Fascinating");
        }
        else {
            System.out.println("Not Fascinating");
        }

    }

    public static void main(String[] args) {
        checkIfFascinating(19);
    }


}
