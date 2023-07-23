package com.company;

import java.util.Scanner;

public class Pattern1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();

        int i,j,num;
            for (i = 0; i < n; i++) {
                num = 1;
                for (j = 0; j <= i; j++) {
                    System.out.print(num);
                    num++;

                }
                System.out.println();
            }
        }


    }

