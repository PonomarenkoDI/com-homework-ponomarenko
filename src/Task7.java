import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner bukva = new Scanner(System.in);
        System.out.println("Введите букву: ");
        String bukva1 = bukva.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
        Matcher matlatletter = patlatletter.matcher(bukva1);
        Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
        Matcher matkirletter = patkirletter.matcher(bukva1);
        Pattern patnumber = Pattern.compile("[0-9]{1}");
        Matcher matnumber = patnumber.matcher(bukva1);
        if(matlatletter.matches())
        {
            System.out.println("Латиница");
        }
        else if(matkirletter.matches())
        {
            System.out.println("Кирилица");
        }
        else if(matnumber.matches())
        {
            System.out.println("Цифра");
        }
        else
        {
            System.out.println("Невозможно определить");
        }
}}
