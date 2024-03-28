package main.java.com.kgk.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.pow;

//https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class JavaLoop {

    public static void test(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = 0;
            N = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i = 1; i <= 10; i++){
                int result = N * i;
                System.out.printf("%d x %d = %d%n", N, i, result);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /*
        if a = 0, b = 2, n = n
     (a + 2^0*b)(a + 2^0*b + 2^1*b)(a + 2^0*b + 2^1*b + 2^2*b).....(a + 2^0*b + 2^1*b + 2^2*b....+2^(n-1)*b)
     */
    public static void test2(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            for(int x = 0; x < n; x++){
                result = (int) (result + (pow(2, x) * b));
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
