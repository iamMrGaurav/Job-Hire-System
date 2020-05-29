package polymorph;

public class Runner  {
    public static void main(String[] args) {
        BillingSystem obj = new Mycafe();
        obj.calculateTotal();

         BillingSystem obj2 = new MyRestro();
         obj2.calculateTotal();
    }


}
