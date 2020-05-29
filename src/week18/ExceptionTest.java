package week18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        int num=0;
      try {
          do {
              Scanner scan = new Scanner(System.in);
              System.out.println("Enter a number 11 to 20");

              num = scan.nextInt();
              if (num < 11 || num > 20)
                  System.out.println("\nIllegal value," + num + "entered.please try again!!");
          } while (num < 11 || num > 20);
          System.out.println("\nValue correctly entered!!");
      }
      catch (InputMismatchException e){
          System.out.println("Exception ERROR!!!!");

      }
    }
}

