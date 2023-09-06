package september;

import java.util.*;

/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.
        Example 1:
        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6
        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
        In this case, 6 units of rain water (blue section) are being trapped.
        Example 2:

        Input: height = [4,2,0,3,2,5]
        Output: 9*/
public class CodeChallenge_0509 {
    static class Index {
        private int start;

        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] heightArray = {4, 2, 0, 3, 2, 5};
        int[] heightArray1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        findTrappedWater(heightArray1);
        optimumSolution1(heightArray);
    }

    private static void optimumSolution1(int[] heightArray) {

        int count=0;
        int left =0; int right=heightArray.length-1;

        int maxheightleft=0; int maxheightright=0;

        while(left<right){
            if(heightArray[left]>=heightArray[right]){
                if(heightArray[right]>maxheightright){
                    maxheightright=heightArray[right];
                }else {
                    count=count+maxheightright-heightArray[right];
                }
                right--;
            }else {
                if(heightArray[left]>maxheightleft){
                    maxheightleft=heightArray[left];
                }else {
                    count=count+maxheightleft-heightArray[left];
                }
                left++;

            }
        }
        System.out.println("count "+count);
    }

    private static void findTrappedWater(int[] heightArray) {
        List<Index> list = findTrappedWaterIndex(heightArray);

        int minIndex = list.get(0).start;
        int maxIndex = list.get(0).end;

        boolean flag = false;
        for (Index index : list) {
            if (index.start < minIndex && index.end > maxIndex) {
                minIndex = index.start;
                maxIndex = index.end;
                flag = true;
                System.out.println("boo");
            }
        }
//        if(maxIndex!=list.get(0).end){
//            flag=true;
//        }
//        System.out.println(heightArray[minIndex]+ " "+heightArray[maxIndex]);
        System.out.println(flag);
        if (flag) {
            System.out.println("count " + countBlocks(heightArray, minIndex, maxIndex));
        } else {
            int count = 0;

            for (Index index : list) {

                count = count + countBlocks(heightArray, index.start, index.end);

            }
            System.out.println(count);

        }
    }

    private static int countBlocks(int[] heightArray, int minIndex, int maxIndex) {

        int maxBlock = Integer.min(heightArray[minIndex], heightArray[maxIndex]);
        int count = 0;
        for (int i = minIndex; i < maxIndex; i++) {
            if (heightArray[i] < maxBlock) {
                count = count + maxBlock - heightArray[i];
            }
        }
        System.out.println("count " + count);
        return count;
    }


    private static List<Index> findTrappedWaterIndex(int[] heightArray) {
        int count = 0;
        List<Index> list = new ArrayList<>();
        for (int i = 0; i < heightArray.length; i++) {
            System.out.println("i => " + i);
            for (int j = i - 1; j >= 0; j--) {
                if (heightArray[i] == 0) {
                    break;
                }
                if (heightArray[j] >= heightArray[i]) {
                    break;
                }
                if (heightArray[j] == 0) {
                    continue;
                }
                if (heightArray[i] > heightArray[j] && heightArray[j] != 0) {
                    int startIndex = j;
                    int max = Integer.MIN_VALUE;
                    for (int k = j; k >= 0; k--) {
                        if (max < heightArray[k] && heightArray[k] <= heightArray[i]) {
                            max = heightArray[k];
                            startIndex = k;
                        }
                    }
                    count = count + heightArray[i] - heightArray[j];
                    System.out.println(" startIndex " + startIndex + " end " + i);
                    Index ind = new Index();
                    ind.start = startIndex;
                    ind.end = i;
                    list.add(ind);
                    break;
                }
            }
        }
        for (Index e : list) {
            System.out.println(e.start + " " + e.end);
        }
        return list;
    }

    private static void optimumSolution(int[] heightArray) {

        /*int left = 0;
        int right = heightArray.length - 1;
        int res = 0;
        int maxleft = 0, maxright = 0;
        while (left <= right) {
            if (heightArray[left] <= heightArray[right]) {
                if (heightArray[left] >= maxleft) {
                    maxleft = heightArray[left];
                }
                else{
                    System.out.println("left "+left + " res "+(maxleft - heightArray[left]));
                    res += maxleft - heightArray[left];
                }
                left++;
            } else {
                if (heightArray[right] >= maxright){
                    maxright = heightArray[right];
                }
                else {
                    res += maxright - heightArray[right];
                    System.out.println("right "+right +" maxr " +maxright+" res "+(maxright - heightArray[right]));
                }
                right--;
            }
        }
        System.out.println(res);*/


    }

}
