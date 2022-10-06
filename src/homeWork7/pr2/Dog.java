package homeWork7.pr2;

public class Dog {
    String name;

    static int totalDog;

    public Dog() {
        System.out.println("This is Dog");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Sharik";
        totalDog++;

        Dog d1 = new Dog();
        d1.name = "Petia";
        totalDog ++;

        System.out.println("This is first dog: " + d.name);
        System.out.println("This is second dog: " + d1.name);
        System.out.println("Total dog: " + totalDog);
    }
}
