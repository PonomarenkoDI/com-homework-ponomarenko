import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner kordinata = new Scanner(System.in);
        System.out.println("Введите значение х: ");
        System.out.println("Введите значение у: ");
        int x = kordinata.nextInt();
        int y = kordinata.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Координаты находятся в 1 четверти");
        }else if (x < 0 && y > 0) {
            System.out.println("Координаты находятся в 2 четверти");
        }else if(x < 0 && y < 0){
            System.out.println("Координаты находятся в 3 четверти");
        }else if(x > 0 && y < 0){
            System.out.println("Координаты находятся в 4 четверти");
        }

}
 }
