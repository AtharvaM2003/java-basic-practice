//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class exnno1{

    //Function for calculating the average
    public static void inputno(int a,int b,int c){
        int d=(a+b+c)/3; //Average Calculation
        System.out.println("Average of Three no is: "+d);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Input Class

        System.out.println("Enter three no to calculate average: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        inputno(a,b,c); //Function Call for Calculating Average
        
        
    }
}