public class Pr1_4 {
    public static void main(String[] args) {
        spaceship mains = new spaceship();
        mains.spaceship1();
        mains.spaceship2();
    }
}
class spaceship {
    String a = "Spaceship1";
    String b = "Spaceship2";

    public void spaceship1() {
        spaceship name = new spaceship();
        System.out.println("a = " + name.a);
    }

    public void spaceship2() {
        spaceship name1 = new spaceship();
        System.out.println("b = " + name1.b);
    }
}
