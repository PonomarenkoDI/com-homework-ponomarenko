package homeWork6;
public abstract class Oplata {
    int nalog;
     String paymentTapeName;
     int child;
    public abstract double calculateOfPayment(int zarplata);
    public abstract double calculatorOfPaymentWithChild (int zarplata);

    @Override
    public String toString() {
        return "paymentTapeName: " + paymentTapeName +
               ", nalog=" + nalog;
    }
}

