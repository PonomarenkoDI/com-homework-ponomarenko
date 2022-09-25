public class Pr3_3 {
    public static void main(String[] args) {
        StringBuilder op = new StringBuilder("0123456789");
        op.append(4247);
        op.delete(0, 10);
        System.out.println(op);

        StringBuilder op1 = new StringBuilder("0123456789");
        op1.insert(5, 247);
        op1.replace(0, 4, "").replace(4, 9, "");
        System.out.println(op1);
    }
}
