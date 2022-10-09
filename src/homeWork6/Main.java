package homeWork6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Oplata pay = new Stavka();
        person.FIO = "Ivanov";
        person.zarplata = 3000;
        person.typeOplata = pay;
        person.workingDay = 28;
        person.child = 0;
        person.getPaymentMinusNalog();
        System.out.println(person.toString());

        Person person2 = new Person();
        Oplata pay2 = new Pochas();
        person2.FIO = "Sidorov";
        person2.zarplata = 800;
        person2.typeOplata = pay2;
        person2.child = 1;
        person2.getPaymentMinusNalog();
        System.out.println(person2.toString());

        Person person3 = new Person();
        Oplata pay3 = new Sdelnay();
        person3.FIO = "Petrov";
        person3.zarplata = 5500;
        person3.typeOplata = pay3;
        person3.workingHours = 10;
        person3.child = 2;
        person3.getPaymentMinusNalog();
        System.out.println(person3.toString());
    }
}
