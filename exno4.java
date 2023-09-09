//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class exno4 {
    public static void circle(double radius){
        double pi=3.14;
        double cir=2*pi*radius;
        System.out.println("Circumference of Circle: "+cir);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius to find Cicumference of circle: ");
        double radius=sc.nextDouble();
        circle(radius);
    }
}
