package homeWork10.pr10_3;

public class Outer {

public Inner getInner(){
    return new Inner();
}
    class Inner{

    }

    public void main(String[] args) {
        Inner inner = new Inner();
    }

}
