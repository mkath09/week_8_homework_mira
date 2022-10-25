package week8_homework;
/*
1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
 */

import java.util.Scanner;

public class Programme1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count =1;
        int sum = 0;

        while (count<= 10){
            System.out.println("Enter number: " +count);
            boolean validNumber = scanner.hasNextInt();
            if (validNumber){
                int number =scanner.nextInt();
                sum+= number;
                count++;
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all number = "+sum);

        scanner.close();
    }
}

//      Console.Write("Imput the 10 number")
//
//
//        do
//
//    {
//        Console.Write("number-{0} : ,i");
//        n = Convert.ToInt32(Console.Readline());
//        sum += n;
//    }while(i<10);
//    avg =sum/10.0;
//        Console.WriteLine($"The sum number is : {sum}\The Avera
