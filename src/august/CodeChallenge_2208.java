package august;/*
Given two strings a and b consisting of lowercase characters.
The task is to check whether two given strings are an anagram of each other or not.
An anagram of a string is another string that contains the same characters,
only the order of characters can be different.
For example, act and tac are an anagram of each other.

        Note:-

        If the strings are anagrams you have to return True or else return False

        |s| represents the length of string s.


        Example 1:

        Input:a = geeksforgeeks, b = forgeeksgeeks
        Output: YES
        Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
        Example 2:

        Input:a = allergy, b = allergic
        Output: NO
        Explanation: Characters in both the strings are
        not same, so they are not anagrams.
*/

import java.util.Arrays;

public class CodeChallenge_2208 {

    private static boolean findAnagrams(String value1, String value2) {
        char[] c1 = value1.toCharArray();
        char[] c2 = value2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i<c1.length;i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String value1 = "allergy";
        String value2 = "allergic";
        if(findAnagrams(value1,value2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }


}
