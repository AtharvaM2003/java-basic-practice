//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
public class exno8 {

    public static int chkno(int x,int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*x;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to Numbers x and n: ");
        int x=sc.nextInt(); 
        int n=sc.nextInt();    
        System.out.println("Value of one number raised to the power of another: "+chkno(x,n));
    }
    
}
