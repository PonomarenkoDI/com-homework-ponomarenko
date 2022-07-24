public class Pr2_4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 20;

        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);

        System.out.print(random_number1 + " ");
        System.out.print(random_number2 + " ");
        System.out.print(random_number3 + " ");
        System.out.println();
        int sum = random_number1 + random_number2 + random_number3;
        int i = sum / 3;
        for (; i <= 0; i++) {
            break;
        }
        System.out.println("Srednie arifmeticheskoe ravno: " + i);
    }
}



