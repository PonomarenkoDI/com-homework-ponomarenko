package homeWork6;

public abstract class Oplata {
     String paymentTapeName;
     int nalog;

    public abstract double calculateOfPayment(int zarplata);

    @Override
    public String toString() {
        return "paymentTapeName: " + paymentTapeName +
               ", nalog=" + nalog;
    }
}

