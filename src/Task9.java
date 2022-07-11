import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner doroga = new Scanner(System.in);
        System.out.println("Введите коррдинаты начала отрезка: ");
        System.out.println("Введите коррдинаты конца отрезка: ");
        // при условии что отрезок дороги равен 30
        int n = doroga.nextInt();
        if (n>=0 && n<=10){
            System.out.println("Дорога идет вверх");

        } else if (n>=11 && n<=20){
            System.out.println("Дорога идет вниз");

        } else if (n>=21 && n<=30){
            System.out.println("Дорога идет вверх");
        }

    }
}
