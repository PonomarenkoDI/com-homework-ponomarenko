package homeWork5.Task3;

import java.util.Arrays;

public class Task3 {
    public void array() {
        int[][] array1 = {{6, 5, 5}, {8, 9, 1}};
        System.out.println(Arrays.deepToString(array1));
        System.out.println();

        int[][][] array2 = new int[8][8][3];
        array2[0] = array1;
        System.out.println(Arrays.deepToString(array2));
    }

    public static void main(String[] args) {
        Task3 start = new Task3();
        start.array();
    }
}
