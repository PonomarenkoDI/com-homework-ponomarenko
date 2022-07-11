import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int x = chislo.nextInt();
        int y = chislo.nextInt();
        if (x % 2 ==0 && y % 2==0) {
            System.out.println("Yes");
        } else if (x % 2 !=0 && y % 2!=0){
            System.out.println("Yes");
        } else if (x % 2 ==0 && y % 2 !=0){
            System.out.println("Error");
        } else if (x % 2 !=0 && y % 2 ==0){
            System.out.println("Error");
        }
    }
}
