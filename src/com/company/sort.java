package com.company;
import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        int phy = 40;
        int chem = 50;
        int maths = 60;
        int[] marks = new int[5];
        marks [0] = 70;
        marks [1] = 50;
        marks [2] = 60;
        marks[3] = 80;
       // System.out.println(marks[2]);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[1]);


    }
}
