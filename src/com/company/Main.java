package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2;
        double sum = 0;
        double product = 0;
        double average = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        sum = num1+num2;
        product= num1*num2;
        average = (num1+ num2)/2;

        if (sum >200){
            System.out.println( "sum " + sum + " * \n");

        }
        else if (sum <1000){
            System.out.println( " sum  " + sum + " ~ \n");

        }
        else{
            System.out.println("this is not in criteria");
        }

        System.out.println(" sum is : " + sum + " \nproduct is " + product + " \naverage is:" + average );
    }
}