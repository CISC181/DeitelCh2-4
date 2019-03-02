package ch04solutions.ex04_gcs2.B;

// GUICaseStudy Exercise 4.2b: DrawLinesController.java
// Draws lines using a loop
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
         // left to bottom
         gc.strokeLine(0, count * heightStep, (count + 1) * widthStep, height);
         
         // right to bottom
         gc.strokeLine(width, count * heightStep, width - (count + 1) * widthStep, height);
         
         // right to top
         gc.strokeLine(width, height - count * heightStep, width - (count + 1) * widthStep, 0);
         
         // left to top
         gc.strokeLine(0, height - count * heightStep, (count + 1) * widthStep, 0);
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
