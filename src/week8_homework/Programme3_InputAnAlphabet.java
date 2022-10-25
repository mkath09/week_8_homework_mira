package week8_homework;

import java.util.Scanner;

/*
Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
 */
public class Programme3_InputAnAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        String letter = scanner.next().toLowerCase();

        if (letter.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(isThere(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (letter.equals("a") || letter.equals("e") ||
                letter.equals("i") || letter.equals("o") ||
                letter.equals("u")) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
    public static boolean isThere(String l) {
        if (l.charAt(0) > 96 && l.charAt(0) < 123) {
            return true;
        }
        return false;
    }

//    public class Program03VowelConsonant {
//        public void vowelConsonant(char ch) {
 //           check a e i o u or A E I O U is vowels
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                System.out.println("Entered character " + ch + " is  Vowel");
//            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {  // check consonents
//                System.out.println("Entered character " + ch + " is Consonent");
//            } else {
//                System.out.println("Not an alphabet");
//            }
//        }
//
//        public static void main(String[] args) {
//            Scanner Input = new Scanner(System.in);
//            System.out.print("Input an alphabet: : ");
//            char alpha = Input.next().charAt(0);  // get one char form the concole
//            vowelConsonant(alpha);   //check alphbet is
    }

















