package august;
/*
Check if the sentence is pangram.
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
        or false otherwise.

        Example 1:

        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        Output: true
        Explanation: sentence contains at least one of every letter of the English alphabet.
        Example 2:

        Input: sentence = "leetcode"
        Output: false
*/

public class CodeChallenge_2908 {

    private static void findpangram(String string) {
        String newString="";
        for(char i='a';i<='z';i++){
            System.out.println(i+" "+string.indexOf(i));

            if(string.indexOf(i)!=-1){

                newString = newString+i;
            }
        }
        System.out.println(newString);
        if(newString.length() ==26){
            System.out.println("Panagram");
        }
    }
    private static void findpangram1(String string) {

        for(char ch ='a';ch<='z';ch++ ){
            if(string.indexOf(ch)==-1) {
                System.out.println("Not Panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }
    public static void main(String[] args) {
        String string = "thequickbrownfoxju mpsoverthelazydot";

        findpangram(string);

    }




}
