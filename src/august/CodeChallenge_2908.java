package august;

import java.util.Arrays;

/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

        Example 1:

        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
        Example 2:

        Input: s = "God Ding"
        Output: "doG gniD"*/
public class CodeChallenge_2908 {

    private static void reverseString(String string) {

        String[] words = string.split("\\s");
        System.out.println(Arrays.toString(words));
        String revString = "";
        for(String s : words){
            for (int i=s.length()-1;i>=0;i--){
//                System.out.println(s.charAt(i));
                revString = revString + s.charAt(i);
            }
            revString = revString + " ";
        }
        System.out.println(revString);
    }

    private static void reverseString1(String string) {
        String[] words = string.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words){
            StringBuilder str = new StringBuilder(word);
            str.reverse();
            stringBuilder.append(str+" ");
        }
        System.out.println(stringBuilder);
    }

    private static void reverseStringLastToFirst(String string) {

        String[] words = string.split("\\s");
        System.out.println(Arrays.toString(words));
        String revString = "";
        for(int i=words.length-1;i>=0;i--){
            String s = words[i];
            for (int j=s.length()-1;j>=0;j--){
//                System.out.println(s.charAt(j));
                revString = revString + s.charAt(j);
            }
            revString = revString + " ";
        }
        System.out.println(revString);
    }

    public static void main(String[] args) {
        String string ="Let's take LeetCode contest";

        reverseString(string);
    }




}
