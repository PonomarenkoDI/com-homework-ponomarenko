import java.util.Scanner;

public class Pr2_2 {
    public static void main(String[] args) {
        Scanner monetca = new Scanner(System.in);
        System.out.print("Press enter: ");
        String num = monetca.nextLine();
        int orel = 1;
        int rehka = 2;
        int randomNum = orel + (int) (Math.random() * rehka);
        if (randomNum == 1) {
            System.out.println("Orel");
        } else {
            System.out.println("Rehka");
        }


    }
}





