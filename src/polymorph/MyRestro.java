package polymorph;

public class MyRestro extends BillingSystem {
    @Override
    public double getServiceCharge() {
        serviceCharge = 12;
        return super.getServiceCharge();
    }

    @Override
    public double getVat() {
        return super.getVat();
    }
}
