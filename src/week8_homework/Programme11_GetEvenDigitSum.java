package week8_homework;

/*
 Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class Programme11_GetEvenDigitSum {
    public static void main(String[] arg) {
        System.out.println(getEvenDigitSum(12345678));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number " + originalNumber + "us equal to:");

            }
            return sumEvenDigits;
        }
        System.out.println("Invalid input: ");
        return -1;
    }

}





