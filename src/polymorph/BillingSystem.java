package polymorph;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BillingSystem {
    double serviceCharge = 10;
    double vat = 13;

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getVat() {
        return vat;
    }
    public void calculateTotal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Total amount:");
        double subtotal = scan.nextInt();
        double total = subtotal + ((getServiceCharge()/100) * subtotal) + ((getVat()/100) * subtotal);
        System.out.println(total);

    }

}
