package main.java.com.kgk.basic;

import java.util.Scanner;

public class JavaOutputFormattingTest {

    public static void test(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String formattedString = String.format("%-15s %03d", s1, x);
            System.out.println(formattedString);
        }
        System.out.println("================================");
    }
}
