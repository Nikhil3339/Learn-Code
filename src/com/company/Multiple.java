package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int a=1,mul=0;

            for( int i=1; i<=10; i++) {
                mul = n*a;
                a = a+2;
                System.out.println("Multiplied Value is ="+ mul);
            }


        }
    }












