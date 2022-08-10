import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        Scanner koren = new Scanner(System.in);
        System.out.println("Введите a, b и c: ");
        double a, b, c;
        double D;
        a = koren.nextDouble();
        b = koren.nextDouble();
        c = koren.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет корень: x = " + x);
        }
        else {
            System.out.println("В уравнение нет корней");
        }

    }
}
