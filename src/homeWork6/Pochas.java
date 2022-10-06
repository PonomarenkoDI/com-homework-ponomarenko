package homeWork6;

public class Pochas extends Oplata {

    public Pochas() {
        super.paymentTapeName = "Pochasovay";
        super.nalog = 20;
    }

    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = (double) zarplata * nalog / 100;
        return zarplata - nalogTotal;

    }
}