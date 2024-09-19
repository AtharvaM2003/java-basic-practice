package Accenture;

import java.util.*;
public class xoriarr {
    public static void main(String[] args) {
        int slen=6;
        int []a={10,5,6,3,7,2};
        int s=0,ab=0;
        for(int i=0;i<slen;i++){
            if(i%2==0){
                s=s^a[i];

            }
            else{
                ab+=a[i];

            }

        }
        System.out.println(ab-s);
    }
}
