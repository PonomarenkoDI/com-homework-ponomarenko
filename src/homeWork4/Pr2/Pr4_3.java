public class Pr4_3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        int number1 = 0;
        int number2 = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - number1)) + number1);
            System.out.print(array[i] + " ");
        }
        {
            System.out.println();
        }
        int s = array.length;
        int temp;
        for (int i = 0; i < s/2; i++) {
            temp = array  [s-i-1];
            array [s-i-1] = array[i];
            array [i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
