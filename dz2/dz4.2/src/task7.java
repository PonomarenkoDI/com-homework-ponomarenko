import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner cifra = new Scanner(System.in);
        System.out.println("Vvedite polojitelnoe chislo: ");
        int n = cifra.nextInt();
        int perevert = 0;
        for(int perevet =0;n != 0; n /= 10) {
            int number = n % 10;
            perevert = perevert * 10 + number;
        }
        System.out.println(perevert);
    }
}

