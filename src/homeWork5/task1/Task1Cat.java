package homeWork5.task1;

public class Task1Cat {
   private String nameCat;
   private int ageCat;
   private String colorCat;

    public Task1Cat(String nameCat, int ageCat, String colorCat) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
        this.colorCat = colorCat;
    }

    public static void main(String[] args) {
        Task1Cat cat1 = new Task1Cat("Jhon", 1, "brown");
        System.out.println(cat1.nameCat);
        System.out.println(cat1.ageCat);
        System.out.println(cat1.colorCat);
    }
}
