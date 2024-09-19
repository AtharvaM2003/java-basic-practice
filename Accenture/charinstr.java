package Accenture;

import java.util.*;

class charinstr{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int len=s.length();
    int count=0;
    char c=sc.nextLine().charAt(0);

    for(int i=0;i<len;i++){
        char temp=s.charAt(i);
        if(temp==c){
            count ++;

        }
    }
    System.out.println(count);
}
}