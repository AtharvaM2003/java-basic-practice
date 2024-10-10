package Accenture;

import java.util.Scanner;

public class SpecialFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input N
        int N = sc.nextInt();
        
        // Array to store Fibonacci-like series values
        int[] f = new int[N + 1];
        
        // Base cases
        f[0] = 1;
        f[1] = 1;
        
        // Calculate values for the series from f(2) to f(N)
        for (int i = 2; i <= N; i++) {
            f[i] = (f[i - 1] * f[i - 1] +  f[i - 2] * f[i - 2]) % 47;
        }
        
        // Output the Nth value in the series
        System.out.println(f[N]);
        
        sc.close();
    }
}
