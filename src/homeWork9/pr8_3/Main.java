package homeWork9.pr8_3;

public class Main {
    public static void main(String[] args) {
        SportSpaceShip sportSpaceShip = new SportSpaceShip();
        sportSpaceShip.start();
        sportSpaceShip.down();

        WarSpaceShip warSpaceShip = new WarSpaceShip();
        warSpaceShip.left();
        warSpaceShip.stop();

        AvtozakSpaceShip avtozakSpaceShip = new AvtozakSpaceShip();
        avtozakSpaceShip.up();
        avtozakSpaceShip.right();
    }
}
