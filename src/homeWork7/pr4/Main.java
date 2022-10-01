package homeWork7.pr4;

public class Main {
    public static void main(String[] args) {
        Amphibian frog1 = new Frog();
        frog1.moveInWater();
        ((Frog)frog1).sayKva();

        Amphibian triton = new Triton();
        triton.moveOnLand();

    }
}
