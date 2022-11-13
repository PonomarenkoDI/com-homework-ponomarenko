package homeWork10.pr10_3;

public class Outer_1 {
    private String name;

    public Outer_1(String name) {
        this.name = name;
    }

    public Inner getInner() {
        return new Inner();
    }

    public class Inner{

    }


    public void main(String[] args) {
       Inner inner = new Inner();

    }

}

