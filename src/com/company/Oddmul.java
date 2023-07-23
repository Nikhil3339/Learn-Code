package com.company;

import java.util.Scanner;

public class Oddmul {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
        int mul = 0;
            int a=10;
            for (int i = 1; i <= 10; i++) {
                a= a%2;
                mul = n * a;
                System.out.println("Multiplied Value is =" + mul);
            }
        }
    }
