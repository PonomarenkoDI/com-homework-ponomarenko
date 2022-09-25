public class Pr1_2 {
    public static void main(String[] args) {
        numberAndSymbol numberAndSymbol1 = new numberAndSymbol();
        numberAndSymbol numberAndSymbol2 = new numberAndSymbol();
        System.out.println("Значение int: " + numberAndSymbol1.number);
        System.out.println("Значение char: " + numberAndSymbol2.symbol);
    }
}
class numberAndSymbol{
    int number;
    char symbol;
}



