package class20;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */ double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void getInterestPayment() {
        System.out.println("Your interest is " + (balance * interest));
    }
}

class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void getInterestPayment() {
        System.out.println("Your AX interest is " + (balance * interest));
    }
}

class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(3000, .11);
        Visa visa = new Visa(1244, .14);
        AX ax = new AX(400, .25);

        creditCard.getInterestPayment();
        visa.getInterestPayment();
        ax.getInterestPayment();
    }
}