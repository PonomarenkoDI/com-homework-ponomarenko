public class Pr2_1 {
    static String s = "hello";
    public static void main(String[] args) {
        homework storage1 = new homework();
        System.out.println(storage1.storage(s));
    }
    public void storage() {
    }
    static class homework {
        int storage(String s) {
            return s.length() * 2;
        }
    }
}
