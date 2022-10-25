package week8_homework;
/*
Write a program in Java to display the pattern like a diamond.
 While loop
 */

public class Programme14_DisplayThePattern {
    public static void main(String[] args) {

        int i,j,r=5;
//        System.out.println("Input number of rows (half of the diamond) : ");
//        Scanner scanner= new Scanner(System.in);
//       r = scanner.nex
        for ( i =1;  i<= r-i;j++) {

            for (i = 0; i < r - i; i++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i=r-1;i>=1;i--){
            for (j=1;j<=-i;j++)
                System.out.print(" ");
            for (j=1;j<2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}








