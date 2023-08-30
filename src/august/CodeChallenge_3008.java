package august;

import java.util.Arrays;

/*
You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.

        Given the string command, return the Goal Parser's interpretation of command.
        Example 1:

        Input: command = "G()(al)"
        Output: "Goal"
        Explanation: The Goal Parser interprets the command as follows:
        G -> G
        () -> o
        (al) -> al
        The final concatenated result is "Goal".
        Example 2:

        Input: command = "G()()()()(al)"
        Output: "Gooooal"
        Example 3:

        Input: command = "(al)G(al)()()G"
        Output: "alGalooG"*/
public class CodeChallenge_3008 {

    private static String matchPattern(String str) {
//        System.out.println(str);
        if(str.equals("G")){
            return "G";
        }
        else if(str.equals("()")){
            return "o";
        }
        else if(str.equals("(al)")) {
            return "al";
        }
        else {
            return "NA";
        }
    }

    private static void findConcatStringBuffer(String inputString) {
        char[] words = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder finalString = new StringBuilder();

        for(char c : words){
            stringBuilder.append(c);
            String temp = matchPattern(String.valueOf(stringBuilder));
            if(temp != "NA"){
                finalString.append(temp);
//                System.out.println(stringBuilder);
//                System.out.println(stringBuilder.length());
                stringBuilder.delete(0,stringBuilder.length());
            }
        }
        System.out.println(finalString);
    }

    private static void findConcatString(String inputString) {

        char[] words = inputString.toCharArray();
        String str ="";
        String finalString="";
        System.out.println(Arrays.toString(words));
        for(char c : words){
            str = str + c;
            String temp =matchPattern(str);
            if(temp != "NA"){
                finalString = finalString+temp;
                str="";
            }
        }
        System.out.println(finalString);

    }


    public static void main(String[] args) {
        String inputString = "G()()()()(al)";

        findConcatStringBuffer(inputString);
    }




}
