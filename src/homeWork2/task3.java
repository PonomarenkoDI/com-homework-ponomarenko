public class task3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(" ");
            }
            for (int b = 1; b < i * 2 ; b++) {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
}
