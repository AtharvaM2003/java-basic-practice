//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
public class exno9 {
    public static int chkdiv(int n1,int n2){
        while(n1 != n2) { 
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
 
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number to find greatest common divisor: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        chkdiv(a, b);
    }
}
