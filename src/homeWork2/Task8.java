package homeWork2;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Task8 m = new Task8();
        Scanner cifra = new Scanner(System.in);
        System.out.print("Vvedite polojitelnoe chislo: ");
        int n = cifra.nextInt();
        int podchiotNum = m.podhiotKolichNumbers(n);
        int podchiotSum = m.podhiotSumm(n);
        System.out.println("Kolichestvo number: " + podchiotNum);
        System.out.println("Summa vvedionih number: " + podchiotSum);
    }

    public int podhiotKolichNumbers(int n) {
        int tmp = 0;
        do {
            tmp++;
            n /= 10;
        } while (n != 0);
        return tmp;
    }

    public int podhiotSumm(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}


