package com.company;

public class Exception_Handling {
    public static void main(String[] args) {
        // in exception handling we use try and catch methode
        // so we create a array and input the marks them prints the wrong index
        int[] marks = {95, 96, 97};
        try {
            System.out.println(marks[5]);
        }
        catch(Exception exception){
            // do something after catching
        }
        System.out.println("Nikhil");
    }
}