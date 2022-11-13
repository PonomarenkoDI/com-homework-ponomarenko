package homeWork9.pr8_5;

public class Unicycle extends Cycle{
    @Override
    public void ride() {
        wheels =  1;
        System.out.println("Unicycle has" + getWheels() +" wheels");
    }
    public void balance () {
        System.out.println("Unicycle has balance");
    }

}
