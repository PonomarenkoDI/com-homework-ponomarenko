package homeWork6;

public class Stavka extends Oplata {

<<<<<<< HEAD
=======
    public Stavka() {
        super.paymentTapeName = "Stavka";
        super.nalog = 20;
    }

    @Override
    public double calculateOfPayment(int zarplata) {
        double nalogTotal = (double) zarplata * nalog / 100;
        return zarplata - nalogTotal;

    }
>>>>>>> 150663840ab20718ed9e998f3e663870c4746522
}
