package august;
/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram.
The only allowed operation is to remove a character from any string.
Find the minimum number of characters to be deleted to make both the strings anagram.
Two strings are called anagram of each other if one of them can be converted into
another by rearranging its letters.

        Example 1:

        Input:
        S1 = bcadeh
        S2 = hea
        Output: 3
        Explanation: We need to remove b, c
        and d from S1.
        Example 2:

        Input:
        S1 = cddgk
        S2 = gcd
        Output: 2
        Explanation: We need to remove d and
        k from S1.
*/

public class CodeChallenge_3108 {
    private static void makeAnagram(String inputString1, String inputString2) {

        char[] c1 = inputString1.toCharArray();
//        char[] c2 = inputString2.toCharArray();
        int count=0;
        for(char c : c1){
            if(inputString2.indexOf(c)==-1){
                System.out.println("Remove "+c );
                count++;
            }
        }
        System.out.println("Count "+count);
    }

    public static void main(String[] args) {
        String inputString1 = "gcd";
        String inputString2 = "cddgk";

        if(inputString1.length()>inputString2.length()){
            makeAnagram(inputString1,inputString2);
        }else {
            makeAnagram(inputString2,inputString1);
        }
    }


}
