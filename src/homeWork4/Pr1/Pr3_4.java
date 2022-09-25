public class Pr3_4 {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 1; i < a; i++) {
            boolean number = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    number = false;
                    break;
                }
            }
            if (number) {
                System.out.print(i + " ");
            }
        }
    }
}