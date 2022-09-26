import java.util.Arrays;

public class Pr4_1 {
    public static void main(String[] args) {
        int[] array;
        array = new int[20];
        int number1 = 0;
        int number2 = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - number1)) + number1);
            System.out.print(array[i] + " ");
        }
        {
            System.out.println();
        }
        Arrays.sort(array);
        System.out.println("Otsortirovaniy array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
    }
}