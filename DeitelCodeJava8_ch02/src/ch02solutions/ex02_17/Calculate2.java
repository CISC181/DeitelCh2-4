package ch02solutions.ex02_17;

// Exercise 2.17 Solution: Calculate2.java
// Make simple calculations on three integers.
import java.util.Scanner;

public class Calculate2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer: "); // prompt for input
      int number1 = input.nextInt(); // read first number
      System.out.print("Enter second integer: "); // prompt for input
      int number2 = input.nextInt(); // read second number
      System.out.print("Enter third integer: "); // prompt for input
      int number3 = input.nextInt(); // read third number

      // determine largest value
      int largest = number1; // assume number1 is the largest

      if (number2 > largest) { // determine whether number2 is larger
         largest = number2;
      }

      if (number3 > largest) { // determine whether number3 is larger
         largest = number3;
      }

      // determine smallest value
      int smallest = number1; // assume number1 is the smallest

      if (number2 < smallest) { // determine whether number2 is smallest
         smallest = number2;
      }

      if (number3 < smallest) { // determine whether number3 is smallest
         smallest = number3;
      }

      // perform calculations
      int sum = number1 + number2 + number3;
      int product = number1 * number2 * number3;
      int average = sum / 3;

      // print results
      System.out.printf("%nFor the numbers %d, %d and %d%n", 
         number1, number2, number3);
      System.out.printf("Largest is %d%n", largest);
      System.out.printf("Smallest is %d%n", smallest);
      System.out.printf("Sum is %d%n", sum);
      System.out.printf("Product is %d%n", product);
      System.out.printf("Average is %d%n", average);
   } // end main
} // end class Calculate2


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
