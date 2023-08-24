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
        int keys = 789;
        findCombinations(keys);

    }


}
