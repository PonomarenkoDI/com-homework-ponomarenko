package homeWork9.pr8_3;

public class WarSpaceShip extends SpaceShipMain implements Engine, ControlPanel{
    @Override
    public void up() {
        System.out.println("UP WarSpaceShip");
    }

    @Override
    public void down() {
        System.out.println("down WarSpaceShip");
    }

    @Override
    public void left() {
        System.out.println("left WarSpaceShip");
    }

    @Override
    public void right() {
        System.out.println("right WarSpaceShip");
    }

    @Override
    public void start() {
        System.out.println("start WarSpaceShip");
    }

    @Override
    public void stop() {
        System.out.println("stop WarSpaceShip");
    }
}
