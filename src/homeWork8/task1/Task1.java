package homeWork8.task1;

public class Task1 {
    int a = 4;
    int b = 6;


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.metodsSlogenie();
    }

    public int metodsSlogenie() {
        long m = System.currentTimeMillis();
        int summ = a + b;
        for (int i = 0; summ < 1000000; summ++) {
            System.out.println(summ);
        }
        long n = System.currentTimeMillis();
        System.out.println("Time raschiota: " + (n - m) + "ms");
        return summ;
    }

}
