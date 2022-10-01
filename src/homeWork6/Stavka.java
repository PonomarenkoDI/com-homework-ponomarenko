package homeWork6;

public class Stavka extends Oplata {

    public Stavka() {
        super.paymentTapeName = "Stavka";
        super.nalog = 20;
    }

    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = (double) zarplata * nalog / 100;
        return zarplata - nalogTotal;

    }
}
