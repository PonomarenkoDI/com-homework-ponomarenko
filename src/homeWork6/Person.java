package homeWork6;

public class Person {
    String FIO;
    int workingDay;
    int workingHours;
    int zarplata;
    Oplata typeOplata;
    double totalZarplata;
    int child;

    public void getPaymentMinusNalog () {
        if (workingDay != 0) {
            this.totalZarplata = typeOplata.calculateOfPayment(zarplata * workingDay);
        } else if (workingHours != 0){
            this.totalZarplata =  typeOplata.calculateOfPayment(zarplata * workingHours);
        } else {
            this.totalZarplata = typeOplata.calculateOfPayment(zarplata);
        }

        System.out.println();
    }


    @Override
    public String toString() {
        return "Person:" +
                "FIO=" + FIO +
                ", workingDay=" + workingDay +
                ", workingHours=" + workingHours +
                ", zarplata=" + zarplata +
                ", typeOplata=" + typeOplata +
                ", totalZarplata=" + totalZarplata +
                ", child=" + child;
    }
}