public class Pr1_3 {
    public static void main(String[] args) {
    DataOnly dataOnly1 = new DataOnly();
        System.out.println(dataOnly1.i);
        System.out.println(dataOnly1.d);
        System.out.println(dataOnly1.b);
    }
}
class DataOnly {
    int i=5;
    double d=5.8;
    boolean b=true;
}