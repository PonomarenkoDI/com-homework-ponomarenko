import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner lestnica = new Scanner(System.in);
        System.out.println("Vvedite chislo stupenek: ");
        int number = lestnica.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
            {
                System.out.println();
            }
            }

        }
    }

