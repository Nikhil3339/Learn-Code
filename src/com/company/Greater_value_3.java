package com.company;
import java.util.Scanner;
public class Greater_value_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<b) {
            System.out.println(b);
        }
        else if(b<c) {
            System.out.println(c);
        }
        else
            System.out.println(c);
    }
}
