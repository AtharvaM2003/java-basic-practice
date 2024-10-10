package Accenture;
import java.util.*;
public class sumpair {
    public static void main(String[] args) {
        int n=8;
        int arr[]={11,1,2,8,10,11,15,7};
        int maxval=Integer.MIN_VALUE;
        int el1=-1,el2=-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i]+arr[j];
                if(temp==18){
                    int product=arr[i]*arr[j];
                    
                    if (product>maxval) {
                        maxval=product;
                        System.out.println("{" + arr[i] + "," + arr[j] + "}");
                    }

                }
            }
        }
    }
}
