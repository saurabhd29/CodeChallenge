package september;
/*Given a positive integer N, print count of set bits in it.

        Example 1:

        Input:
        N = 6
        Output:
        2
        Explanation:
        Binary representation is '110'
        So the count of the set bit is 2.
        Example 2:

        Input:
        8
        Output:
        1
        Explanation:
        Binary representation is '1000'
        So the count of the set bit is 1.*/
public class CodeChallenge_0809 {

    public static void main(String[] args) {
        int n=12;

        System.out.println(Integer.toBinaryString(n).replace("0","").length());

    }
}
