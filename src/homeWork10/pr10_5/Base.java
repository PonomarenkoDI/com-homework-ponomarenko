package homeWork10.pr10_5;

public class Base {
    private String x = "Hello";

    public void getInt(){
        System.out.println(x);
    }
    void g(){
        Base base = new Base();
        base.getInt();

    }

    public static void main(String[] args) {
        Base base = new Base();
        base.getInt();
    }

}
