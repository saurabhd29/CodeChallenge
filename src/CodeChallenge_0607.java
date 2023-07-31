/*
        Find Majority element (Boyer-Moore Majority vote Algorithm)
        Given an integer array containing duplicates, return the majority element if present. A majority element appears more than n/2 times, where n is the array size.
        For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
        output: {2, 2, 2, 2, 2, 2}
*/
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashSet;

public class CodeChallenge_0607 {

    public static void main(String[] args) {
        int[] array = {1,1, 8, 7,3,1,1, 2, 6, 5,1,1, 2, 3};
        System.out.println(array.length);
        m2();
//        System.out.println("Element :: "+majorityElement(array));
    }

    private static int majorityElement(int[] array) {


        int k=0,m=-1,counter=0;
        while(array.length>k){
            if(counter==0){
                m=array[k];
                counter++;
            }
            else if(m == array[k]){
                counter++;
            }
            else {
                counter--;
            }
            k++;
        }
        return m;
    }

    public static void m2() {
        List<Integer> integerArray = Arrays.asList(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2);

        Entry<Integer, Integer> entry = integerArray.parallelStream()
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.summingInt(count -> BigInteger.ONE.intValue())))
                .entrySet()
                .parallelStream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();

        System.out.println((entry.getValue() > Long.valueOf(integerArray.size() / 2))
                ? IntStream.range(BigInteger.ZERO.intValue(), entry.getValue())
                .boxed()
                .map(__ -> entry.getKey())
                .collect(Collectors.toList())
                : "Not valid data found");
    }

}
