//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class exno2 {

    public static void oddno(int a){
        int sum=0;
        for(int i=1;i<=a;i+=2){
            sum=sum+i;
        }
        System.out.println("Sum of Odd no is: "+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Odd Number till which you want to perform Addition: ");
        int a=sc.nextInt();
        oddno(a);
    }
}
