package ch02solutions.ex02_32;

// Exercise 2.32 Solution: Tally.java
// Program accepts five numbers as input and prints a tally of the 
// number of negatives, positives and zeros.
import java.util.Scanner;

public class Tally {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // initialize counters
      int zeroTally = 0;
      int positiveTally = 0;
      int negativeTally = 0;

      System.out.print("Enter first integer: "); // prompt for input
      int inputNumber = input.nextInt(); // read first number

      if (inputNumber == 0) {
         zeroTally = zeroTally + 1;
      }

      if (inputNumber < 0) {
         negativeTally = negativeTally + 1;
      }

      if (inputNumber > 0) {
         positiveTally = positiveTally + 1;
      }

      System.out.print("Enter second integer: "); // prompt for input
      inputNumber = input.nextInt(); // read second number

      if (inputNumber == 0) {
         zeroTally = zeroTally + 1;
      }

      if (inputNumber < 0) {
         negativeTally = negativeTally + 1;
      }

      if (inputNumber > 0) {
         positiveTally = positiveTally + 1;
      }

      System.out.print("Enter third integer: "); // prompt for input
      inputNumber = input.nextInt(); // read third number

      if (inputNumber == 0) {
         zeroTally = zeroTally + 1;
      }

      if (inputNumber < 0) {
         negativeTally = negativeTally + 1;
      }

      if (inputNumber > 0) {
         positiveTally = positiveTally + 1;
      }

      System.out.print("Enter fourth integer: "); // prompt for input
      inputNumber = input.nextInt(); // read fourth number

      if (inputNumber == 0) {
         zeroTally = zeroTally + 1;
      }

      if (inputNumber < 0) {
         negativeTally = negativeTally + 1;
      }

      if (inputNumber > 0) {
         positiveTally = positiveTally + 1;
      }

      System.out.print("Enter fifth integer: "); // prompt for input
      inputNumber = input.nextInt(); // read fifth number

      if (inputNumber == 0) {
         zeroTally = zeroTally + 1;
      }

      if (inputNumber < 0) {
         negativeTally = negativeTally + 1;
      }

      if (inputNumber > 0) {
         positiveTally = positiveTally + 1;
      }

      // create a string describing the results
      System.out.printf("There are %d negative numbers%n", 
         negativeTally);
      System.out.printf("There are %d positive numbers%n", 
         positiveTally);
      System.out.printf("%nThere are %d zeros%n", zeroTally);
   } // end main 
} // end class Tally


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
