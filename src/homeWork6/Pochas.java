package homeWork6;

public class Pochas extends Oplata {

    public Pochas() {
        super.paymentTapeName = "Pochasovay";
        super.nalog = 20;
        super.child = 5;
    }


    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = (double) zarplata * nalog / 100;
        return zarplata - nalogTotal;
    }

    @Override
    public double calculatorOfPaymentWithChild(int zarplata) {
        double nalogChild = nalog + child;
        return zarplata - (zarplata * nalogChild/100);
    }
}
