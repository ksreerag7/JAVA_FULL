// CreditCardPayment and UPIPayment both implement the Payment interface.
// Concept: Interface — defines a contract (pay()), multiple classes provide different implementations.
interface Payment{
    void pay();
}

class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment is done using Credit Card.");
    }
}

class UPIPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI.");
    }
}
public class pgm29 {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CreditCardPayment();
        p1.pay();
        p2.pay();
    }
}
