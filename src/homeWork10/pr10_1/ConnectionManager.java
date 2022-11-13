package homeWork10.pr10_1;

public class ConnectionManager  {
    private static ConnectionManager  singleton;

    private ConnectionManager () {}

    public static ConnectionManager getInstance(){
        if (singleton == null) {
            singleton = new ConnectionManager();
        }
        return singleton;
    }

    public void sayHelloWihHashCode() {
        System.out.println("show hashcode " + hashCode());
    }
}

