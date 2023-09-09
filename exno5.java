//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class exno5 {
    //Function for eligibity of voting
    public static void agecal(int age){
        if(age<18){
            System.out.println("You're Not Eligible for voting");

        }
        else if(age>18) {
            System.out.println("You're Eligible for voting");
        }
        else{
            System.out.println("Enter Valid Choice");
            }
            

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age= sc.nextInt();
        agecal(age);


    }
}
