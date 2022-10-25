package week8_homework;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 */
public class Programme6 {
    public static void main(String[] args) {
        int j,n,i;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input number in raw:  ");
           n = scanner.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println(" ");
    }

    }
}
