package homeWork8.task2;


public class ConnectionManager {
    private static Connection[] connections = {
            new Connection(),
            new Connection(),
            new Connection()
    };
    private static int admissibleConnection = connections.length;

    public static Connection getConnection() {
        if (admissibleConnection != 0) {
            return connections[connections.length - admissibleConnection--];
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getConnection());
        }

    }
    static class Connection {

        Connection() {

        }

    }
}



