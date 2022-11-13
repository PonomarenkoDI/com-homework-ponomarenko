package homeWork9.pr8_3;

public class SportSpaceShip extends SpaceShipMain implements Engine, ControlPanel{
    @Override
    public void up() {
        System.out.println("UP SportSpaceShip");
    }

    @Override
    public void down() {
        System.out.println("down SportSpaceShip");
    }

    @Override
    public void left() {
        System.out.println("left SportSpaceShip");
    }

    @Override
    public void right() {
        System.out.println("right SportSpaceShip");
    }

    @Override
    public void start() {
        System.out.println("start SportSpaceShip");
    }

    @Override
    public void stop() {
        System.out.println("stop SportSpaceShip");
    }
}
