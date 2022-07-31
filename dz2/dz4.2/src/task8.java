import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner cifra = new Scanner(System.in);
        System.out.println("Vvedite polojitelnoe chislo: ");
        int n = cifra.nextInt();
        int tmp = 0;
        do {
            tmp++;
            n /= 10;
        } while (n != 0);

        System.out.println("Kolichestvo number: " + tmp);

        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum);
    }
}
// Не работает сложение цифр
