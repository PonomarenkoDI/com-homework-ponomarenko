import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        int a = chislo.nextInt();
        int a1 =a/ 100000;
        int a2 = (a / 10000) % 10;
        int a3 = (a / 1000) % 10;
        int a4 = (a / 100) % 10;
        int a5 = (a / 10) % 10;
        int a6 = a % 10;

        if (a1 + a2 + a3 == a4 + a5 + a6) {
            System.out.println("Cчастливое");
        } else {
            System.out.println("Не счастливое");
        }
    }
}
