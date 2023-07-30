import java.util.HashSet;

public class TwoSumArrayIndex {
    public static void main(String[] args){
        int arr [] ={2,3,4,3};
        Object []res = find1(arr,5);
        for(Object num : res)
            System.out.print(num+" ");
    }

    private static Object[] find1(int[] nums,int target) {
        HashSet<Integer> h = new HashSet<>();
        int k=0;

        for(int i=0; i<nums.length-1;i++){
            System.out.println("i "+i + " arr "+nums[i]);
            for(int j=1; j<nums.length;j++) {
                System.out.println("j "+j + " arr "+nums[j]);
                if (i != j && nums[i] + nums[j] == target) {
                    h.add(i);
                    h.add(j);
                }
            }

        }
        Object[] res = h.toArray();
        return res;

    }
}
