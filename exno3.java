//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class exno3 {
    //Function for finding Greater Value
    public static void findgreater(int a,int b){
        if(a<b){
            System.out.println(b +" is Greater");
        }
        else if(b<a){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println("Enter Valid Input!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to find out greater Value: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        findgreater(a,b);//Function call
    }
}
