package week18;

public class ArithmeticOperation {
    public void add(int a,int b){
        int sum =a+b;
        System.out.println("Sum of two numbers:" +sum );
    }
    public void divide(int a, int b){
   try {
       int divide=a/b;
       System.out.println(divide);
   }
   catch (ArithmeticException e){
       System.out.println("error");
   }

   }
}
