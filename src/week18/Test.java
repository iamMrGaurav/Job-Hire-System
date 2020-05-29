package week18;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     for (int i=0; i<3; i++ ){
         int a=scan.nextInt();
         int b=scan.nextInt();
         int c=scan.nextInt();

         NumPlay obj = new NumPlay();
         obj.add(a);
         obj.search(b);
         obj.delete(c);

     }

    }
}
