package homeWork6;

public class Sdelnay extends Oplata {

    public Sdelnay() {
        super.paymentTapeName = "Sdelnay";
        super.nalog = 15;
        super.child = 5;

    }

    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = zarplata * nalog / 100;
        return zarplata - nalogTotal;


    }

    @Override
    public double calculatorOfPaymentWithChild(int zarplata) {
        double nalogChild = nalog + child;
        return zarplata - (zarplata * nalogChild/100);
    }
}
