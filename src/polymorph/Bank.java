package polymorph;
public class Bank {
    public static void main(String[] args) {

        NepalRastraBank objnepalrastra = new NepalRastraBank();
        objnepalrastra.displayInterestRate();

        NepalRastraBank newobj = new NICAsia();
        newobj.displayInterestRate();
    }
}
