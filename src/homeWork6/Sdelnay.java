package homeWork6;

public class Sdelnay extends Oplata {

    public Sdelnay() {
        super.paymentTapeName = "Sdelnay";
        super.nalog = 15;

    }

    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = (double) zarplata * nalog / 100;
        return zarplata - nalogTotal;

    }
}
