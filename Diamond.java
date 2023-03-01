//*****************************************************************************
//
//  Diamond.java              Author: Nicolas Viera
//
// Creating a diamond using user input and nested for loops
//*****************************************************************************

import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Please enter an integer: ");

    int size = scanner.nextInt();
    shape(size);
  }
  public static void shape(int size) {
    //---------------------------------------------------------------------
    // statement begins to determine if input is even or odd
    //---------------------------------------------------------------------
    int whitespace = size - 1 ;
    int evenrow;
    int col;

    boolean integer = (size % 2 == 0);
    if (integer == true) {
      for (evenrow = 0; evenrow < size + 1; evenrow++) {
        if (evenrow < (size  / 2) +1 ) {
          for ( col = 0; col < whitespace + 1; col++) {
            if (evenrow == 0 && col == whitespace) {
              System.out.print("*");
            }
            else {
              System.out.print(" "); }

          }
          whitespace = whitespace - 2;
          for ( col = 0; col < 2 * evenrow ; col++) {
            System.out.print("* ");
          }
          System.out.println("");
        } else if (evenrow >= (size / 2 + 1 )) {
          whitespace = evenrow * 2 - size;
          for ( col = 0; col < whitespace; col++) {
            if (evenrow == size && col == whitespace - 1) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }
          }
          for (col = 0; col < 2 * (size - evenrow ) ; col++) {
            System.out.print("* ");
          }
          System.out.println();

        }
      }
    }
    // -----------------------------------------------------------------------
    //  If integer is odd code will run
    //------------------------------------------------------------------------
    else

     {

      for (int oddrow = 0; oddrow < size; oddrow++) {
        if (oddrow < (size / 2 + 1)) {
          for ( col = 0; col < whitespace; col++) {
            System.out.print(" ");
          }

          whitespace -= 1;

          for (col = 0; col < 2 * oddrow + 1 ; col++) {
            System.out.print("*");
          }
          System.out.println("");

        } else if (oddrow >= (size / 2 + 1)) {
          whitespace = oddrow;
          for (col = 0; col < whitespace; col++) {
            System.out.print(" ");
          }
          for (col = 0; col < 2 * (size - oddrow) - 1 ; col++) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
    }
  }
}




