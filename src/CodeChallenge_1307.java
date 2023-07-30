import java.util.Arrays;
import java.util.HashMap;

public class CodeChallenge_1307 {

    private static void numberOfGifts(HashMap<Integer, Integer> map) {
        int count=0, cash=0;

        for (Integer num: map.keySet()) {
            cash++; //Incrementing daily currency

            int value = map.get(num);  //Getting the value of gift
            if(cash>=value){    //cash present is greater than value of gift
                count++;        //gift is purchased, count is incremented
                System.out.println("["+num+","+value+"] --> Possible");
                cash=cash-value; //deducting the
            }
            else{
                System.out.println("["+num+","+value+"] --> Not Possible");
            }
        }

        System.out.println("Count :: "+count);
    }

    private static void numberOfGifts1() {
        int[] price = {3,3,2,1,3};
        int i=0,cash=0,count=0;
        while (i<price.length){
            cash++; //incrementing currency

            if( cash>=price[i] ){    //cash present is greater than value of gift
                count++;        //gift is purchased, count is incremented
                System.out.println("["+(i+1)+","+price[i]+"] --> Possible");
                cash=cash-price[i]; //deducting the
            }
            else{
                System.out.println("["+(i+1)+","+price[i]+"] --> Not Possible");
            }
            i++;
        }
        System.out.println("Count :: "+count);

    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,3);
        map.put(3,2);
        map.put(4,1);
        map.put(5,3);

//        System.out.println(Arrays.asList(map));
//        numberOfGifts(map);
        numberOfGifts1();
    }
}
