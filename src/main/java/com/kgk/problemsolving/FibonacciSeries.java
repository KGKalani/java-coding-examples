package main.java.com.kgk.problemsolving;

/**
 * Printing first 10 Fibonacci Series
 * 0,1,1,2,3,5,8,13,21,34
 */
public class FibonacciSeries {
    //Without using recursion
    public static void FibonacciWithoutRecursion(){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;

        System.out.print(n1 + ", " + n2);
        for(int i = 2; i < count; i++){
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void FibonacciWithRecursion(int n1, int n2, int count){
        int n3;


        System.out.print(n1 + ", " + n2);
        for(int i = 2; i < count; i++){
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
