package ch04solutions.ex04_gcs1.B;

// GUICaseStudy Exercise 4.1b: DrawLinesController.java
// Using strokeLine to connect the corners of a canvas.
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController { 
   @FXML private Canvas canvas; // used to get the GraphicsContext

   // when user presses Draw Lines button, draw two Lines in the Canvas 
   @FXML
   void drawLinesButtonPressed(ActionEvent event) {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();

      int increments = 15; // number of increments each side is divided
      
      double width = canvas.getWidth(); // total width
      double height = canvas.getHeight(); // total height
      
      double widthStep = width / increments; // width increment
      double heightStep = height / increments; // height increment
      
      int count = 0; // loop counter

      while (count < increments) {
         // lines fanning from the top-left
         gc.strokeLine(0, 0, count * widthStep, height - count * heightStep);
         
         // lines fanning from the bottom-right
         gc.strokeLine(width, height, count * widthStep, height - count * heightStep);
         
         // lines fanning from the bottom-left
         gc.strokeLine(0, height, count * widthStep, count * heightStep);
         
         // lines fanning from the top-right
         gc.strokeLine(width, 0, count * widthStep, count * heightStep);

         ++count;
      } 
   }
}

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
