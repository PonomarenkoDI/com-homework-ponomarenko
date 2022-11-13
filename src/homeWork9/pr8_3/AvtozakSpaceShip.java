package homeWork9.pr8_3;

public class AvtozakSpaceShip extends SpaceShipMain implements Engine, ControlPanel{
    @Override
    public void up() {
        System.out.println("UP AvtozakSpaceShip");
    }

    @Override
    public void down() {
        System.out.println("down AvtozakSpaceShip");
    }

    @Override
    public void left() {
        System.out.println("left AvtozakSpaceShip");
    }

    @Override
    public void right() {
        System.out.println("right AvtozakSpaceShip");
    }

    @Override
    public void start() {
        System.out.println("start AvtozakSpaceShip");
    }

    @Override
    public void stop() {
        System.out.println("stop AvtozakSpaceShip");
    }
}
