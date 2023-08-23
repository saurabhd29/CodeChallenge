/*
Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.
Find out whether they touch(at one or more than one points).

        Example 1:

        Input:
        X1=3
        Y1=4
        R1=5
        X2=14
        Y2=18
        R2=8
        Output:
        0
        Explanation:
        The circles centred at (3,4) and (14,18)
        and having radii 5 and 8 respectively
        do not touch each other.
        Example 2:

        Input:
        X1=3
        Y1=4
        R1=5
        X2=14
        Y2=18
        R2=18
        Output:
        1
        Explanation:
        The circles centred at (3,4) and (14,18)
        and having radii 5 and 18 respectively
        touch each other at two points.

        If C1C2 <= R1 – R2: Circle B is inside A.
If C1C2 <= R2 – R1: Circle A is inside B.
If C1C2 < R1 + R2: Circle intersects each other.
If C1C2 == R1 + R2: Circle A and B are in touch with each other.
*/

import java.text.DecimalFormat;
import java.util.*;

public class CodeChallenge_1808 {

    /*private static List conertToList(double[][] c){
        List list = new ArrayList<>();
        for(double[] array : c){
            list.addAll( Arrays.asList(array));
        }

        return list;
    }*/

    private static double[][] findCordinates(Circle circle){
        double[][] c1 = new double[360][2];
        for(int i=0;i<360;i++){
            double x = circle.radius * Math.cos(Math.toRadians(i));
            double y = circle.radius * Math.sin(Math.toRadians(i));
//            System.out.println("x :: "+x+" y :: "+y);
            DecimalFormat df = new DecimalFormat("0.00");
            c1[i][0] = Double.parseDouble(df.format(x));

            c1[i][1] =Double.parseDouble(df.format(y));
        }
//        c1[1][0] = 1.1;
//        c1[1][1] = 2.1;
        for(int i=0; i<360; i++){
            System.out.println(c1[i][0] + " "+ c1[i][1]);
        }
        System.out.println("-------------------------------------------------------------");
        return c1;
    }

    private static void findIntersectionStage(Circle circle1, Circle circle2) {
        double[][] c1;
        double[][] c2;
        c1 = findCordinates(circle1);
        c2 = findCordinates(circle2);
        int count=0;
        for(int i=0;i<c1.length/2;i++){
            for(int j=0; j<c1.length/2;j++){
                if(c1[i][0] == c2[j][0]  && c1[i][1] == c2[j][1]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        Circle circle1= new Circle(3,4,5);
        Circle circle2= new Circle(14,18,8);
        findIntersectionStage(circle1,circle2);
        findByTheorem(circle1,circle2);
    }

    private static void findByTheorem(Circle circle1, Circle circle2) {

        double distance = Math.sqrt(Math.pow((circle1.x-circle2.x), 2) + Math.pow(circle1.y-circle2.y,2));
        System.out.println("Distance "+ distance);
        if(distance> (circle1.radius+circle2.radius)){
            System.out.println("Does Not");
        }
        else{
            System.out.println("it does");
        }
    }


}

class Circle{
    int x;
    int y;

    int radius;

    public Circle(int x, int y, int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;

    }

//    int x1=x+radius;
//    int y1=y;
//
//    int x2=x;
//    int y2=y+radius;
//
//    int x3=x-radius;
//    int y3=y;
//
//    int x4=x;
//    int y4=y-radius;
}

