package week8_homework;

import java.util.Scanner;

/*
Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
 */
public class Programme4_DigitSumChallenge {
    public static void main(String[] args) {
        Programme4_DigitSumChallenge obj = new Programme4_DigitSumChallenge();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number  ");
        int number = scanner.nextInt();
        System.out.println("Sum of the digit " + obj.sumDigit(number));
    }
    //This method will return sum of entered digit
    public int sumDigit(int number) {
        int digit;
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
