package september;
/*Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and
 whose sum of digits should be equals to 'S'. Return -1 if it is not possible.

        Example 1:

        Input: N = 2, S = 9
        Output: 90
        Explaination: It is the biggest number
        with sum of digits equals to 9.
        Example 2:

        Input: N = 3, S = 20
        Output: 992
        Explaination: It is the biggest number
        with sum of digits equals to 20.*/
public class CodeChallenge_1309 {

    public static void main(String[] args) {
        int n=3;
        int s=20;

        findNumber(n,s);
    }

    private static void findNumber(int n, int s) {
        int maxNum = findMax(n);
        while (maxNum>0){
            int sum=0;
            int temp = maxNum;
            while(temp>0){
                sum=sum+temp%10;
                temp=temp/10;
            }
            if(sum == s){
                break;
            }
            maxNum--;
        }
        if(maxNum ==0){
            System.out.println("max num :: "+"-1");
        }else {
            System.out.println("max num :: " + maxNum);
        }
    }

    private static int findMax(int n){
        int maxNum=1;
        for(int i=0;i<n;i++){
            maxNum=maxNum*10;
        }

        System.out.println(maxNum-1);
        return --maxNum;
    }
}
