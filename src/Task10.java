import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner kv = new Scanner(System.in);
        System.out.println("Enter number kvartira: ");
        int n = kv.nextInt();
        if (n>=1 && n<=36){
            System.out.println("Podezd number 1");
        } else if (n>=37 && n<=72){
            System.out.println("Podezd number 2");
        } else if (n>=73 && n<=108){
            System.out.println("Podezd number 3");
        } else if (n>=109 && n<=144) {
            System.out.println("Podezd number 4");
        } else if (n>=145){
            System.out.println("Error");}
    }

}

