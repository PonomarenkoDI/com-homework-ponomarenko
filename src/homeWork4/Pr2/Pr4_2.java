import javax.imageio.stream.ImageInputStream;

public class Pr4_2 {
    public int[] creatMark() {
        int[] mark = {288, 260, 240, 238, 233, 217, 215, 187, 179, 165, 101, 3};
        for (int i = 0; i < mark.length; i++) {
        }
        return mark;
    }

    public static void main(String[] args) {
        Pr4_2 n = new Pr4_2();
        int[] arr = n.creatMark();
        n.showArray(arr);
        int max = n.maxArray(arr);
        int indexMax = n.IndexMaxArr(arr, max);
        System.out.println("Max mark: " + max + " " + "Index max mark: " + indexMax);
    }
    public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int IndexMaxArr(int[] arr, int max) {
        int indexForMax = 0;
        for (int j = 0; j < arr.length; j++) {
            int index = arr[j];
            if (max < index) {
                max = index;
                indexForMax = j;
            }
        }
        return indexForMax;
    }
}
