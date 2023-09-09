// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class exno7 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many no you want to Enter?");
        int n=sc.nextInt();
         int cntp=0,cntn=0,cntz=0;
        System.out.println("Enter Numbers: ");

        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
           
        if(num==0){
            cntz=cntz+1;            
        }
        else if(num<0){
            cntn=cntn+1;
        }
        else if(num>0){
            cntp=cntp+1;
        }
        }
        
        System.out.println("Zero: "+cntz);
        System.out.println("Positive: "+cntp);
        System.out.println("Negative: "+cntn);
    }
}
