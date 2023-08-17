/*
Suppose we are given n red and n blue water jugs, all of different shapes and sizes.
All red jugs hold different amounts of water, as do the blue ones.
Moreover, there is a blue jug for every red jug that holds the same amount of water and vice versa.
The task is to efficiently group the jugs into pairs of red and blue jugs that hold the same amount of water.
        Example:
        Input:
        red = {6, 3, 2, 8, 7};
        blue = {8, 6, 7, 2, 3};

        Output:

        Red jugs: [2, 3, 6, 7, 8]
        Blue jugs: [2, 3, 6, 7, 8]
*/

import java.util.Arrays;

public class CodeChallenge_1608 {

    private static void groupJugs(int[] red, int[] blue) {
        Arrays.sort(red);
        Arrays.sort(blue);

        System.out.println("Red jugs: "+Arrays.toString(red));
        System.out.println("Blue jugs: "+Arrays.toString(blue));
    }
    public static void main(String[] args) {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};

        groupJugs(red, blue);
    }



}
