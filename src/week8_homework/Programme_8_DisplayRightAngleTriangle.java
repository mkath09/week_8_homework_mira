package week8_homework;

import java.util.Scanner;

/* Display right angle triangle of @ using nested for loops

 */
public class Programme_8_DisplayRightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Right Angle Triangle Patten Row =");
        int rows = scanner.nextInt();

        System.out.println("Printing Right Angle Triangle star Pattern");

       for (int i=1;i<=rows;i++){
           for(int j=rows;j>=i;j--){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print("@");
           }
           System.out.println();
       }

            }

        }




