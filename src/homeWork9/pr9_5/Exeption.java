package homeWork9.pr9_5;


public class Exeption {
    String s = null;
    int a = 5;
    int b = 0;
    double res=0;
    public void g () {
            throw new NullPointerException("Hello from NullPointerException");
        }

    public void f() {
        Exeption exeption = new Exeption();
        try {
            exeption.g();
            res = a / b;
        } catch (ArithmeticException ex) {
            System.err.println(ex.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void main (String[] args){
        Exeption exeption = new Exeption();
        exeption.f();
    }
}
