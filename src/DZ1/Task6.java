import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter year: ");
        int y = year.nextInt();
        int b = y % 400;
        int c = y % 100;
        int d = y % 4;
        if (d < 1 && c >= 1) {
            System.out.println("Visokoshiy");
        } else if (b < 1) {
            System.out.println("Visokoshiy");
        } else  {
            System.out.println("Ne Visokoshiy");
    }
}}
