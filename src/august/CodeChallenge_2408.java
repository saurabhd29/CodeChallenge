package august;

/*
Given a sequence of numbers between 2 and 9, print all possible combinations of words formed from
the mobile keypad which has english alphabets associated with each key.
        Input: [2, 3, 4]

        Output:
        ADG BDG CDG AEG BEG CEG AFG BFG CFG ADH BDH CDH AEH BEH CEH AFH BFH CFH ADI BDI
        CDI AEI BEI CEI AFI BFI CFI

*/

import java.util.ArrayList;
import java.util.List;

public class CodeChallenge_2408 {

    private static void findCombinations(int keys) {
        int count = 0;
        String[][] data = {{},{},{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"}
                ,{"P","O","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
        List<Integer> list = new ArrayList<>();
        while(keys>0){
            int num = keys%10;
            list.add(num);
            keys = keys/10;
        }
        System.out.println(list);

            int n1 = list.get(2);
            int n2 = list.get(1);
            int n3 = list.get(0);
            for(int i=0;i<data[n1].length;i++){
                for(int j=0;j<data[n2].length;j++) {
                    for(int k=0;k<data[n3].length;k++) {
                        count++;
                        System.out.print(data[n1][i]);
                        System.out.print(data[n2][j]);
                        System.out.print(data[n3][k]);
                        System.out.print("\t");
                    }
                }
            }
            System.out.println("\nCount "+count);

    }


    public static void main(String[] args) {
        int keys = 234;
        findCombinations2(keys);

    }

    private static void findCombinations2(int keys) {

        Integer i = keys;
        String keyString = i.toString();

        int length = keyString.length();

        if(length == 0){
            System.out.println("Empty");
        }

        List<String> comboList = new ArrayList<>();

        findCombos1(0,comboList,keyString,new StringBuilder());

        System.out.println(comboList);
        System.out.println(comboList.size());


    }
    static int count;
    private static synchronized void findCombos1(int pos, List<String> comboList, String keyString, StringBuilder stringBuilder) {
        char[][] data = {{},{},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'}
                ,{'P','O','R','S'},{'T','U','V'},{'W','X','Y','Z'}};

        if(pos == keyString.length()){
            comboList.add(stringBuilder.toString());
            return;
        }
//        System.out.println("key "+keyString+" charAt "+ keyString.charAt(pos)+" pos "+ pos+" SB "+stringBuilder+" comboList "+comboList);

        char[] letters = data[Character.getNumericValue(keyString.charAt(pos))];

        for(int i=0;i< letters.length;i++){
            findCombos1(pos+1, comboList, keyString, new StringBuilder(stringBuilder).append(letters[i]));
        }
    }
}
