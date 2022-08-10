import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);
        System.out.println("1-кошка");
        System.out.println("2-собака");
        System.out.println("3-курица");
        System.out.println("4-корова");
        System.out.println("5-свинка");
        System.out.println("Введите номер из списка выше: ");
        int a = animal.nextInt();
       switch (a) {
           case (1): {
               System.out.println("мяу");
               break;
           }
           case (2): {
               System.out.println("гав");
               break;
           }
           case (3): {
               System.out.println("ко-ко");
               break;
           }
           case (4): {
               System.out.println("му");
               break;
           }
           case (5): {
               System.out.println("хрю");
               break;
           }}
    }
}
