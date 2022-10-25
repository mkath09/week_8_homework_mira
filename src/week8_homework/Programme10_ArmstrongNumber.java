package week8_homework;

import java.util.Scanner;

/*
. Write a program to input any number and check if it Armstrong number or not
 */
public class Programme10_ArmstrongNumber {

    public static void main(String[] args) {

        method1();
    }

    public static void method1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = obj.nextInt();
        System.out.println("given number is : " + num);
        int temp = num;
        int sum = 0;
        int r = 0;
        //using while loop to get sum variable value for 153 //
        while (num > 0) {
            r = num % 10;//3,5,1
            num = num / 10;//15.3,1.5,0.1
            sum = sum + (r * r * r);//
        }
        if (temp == sum) {
            System.out.println("this is an armstrong number : ");
        } else {
            System.out.println("this is not  an armstrong number : ");
        }
    }




    }
