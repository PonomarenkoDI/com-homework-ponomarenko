import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner goroskop = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        System.out.println("Enter the month of your birth: ");
        System.out.println("Enter your year of birth: ");
        int den = goroskop.nextInt();
        int mes = goroskop.nextInt();
        int god = goroskop.nextInt();
        int y = god%12;
        if ((den > 20 && mes == 1) || (den < 19 && mes == 2 )) {
            System.out.println("Aquarius");
        } else if ((den > 20 && mes == 2) || (den < 20 && mes == 2)) {
            System.out.println("Fish");
        } else if ((den > 21 && mes == 3) || (den < 19 && mes == 4)) {
            System.out.println("Aries");
        } else if ((den > 20 && mes == 4) || (den < 20 && mes == 5)) {
            System.out.println("Taurus");
        } else if ((den > 21 && mes == 5) || (den < 20 && mes == 6)) {
            System.out.println("Twins");
        } else if ((den > 21 && mes == 6) || (den < 20 && mes == 7)) {
            System.out.println("Crayfish");
        } else if ((den > 23 && mes == 7) || (den < 22 && mes == 8)) {
            System.out.println("Lion");
        } else if ((den > 23 && mes == 8) || (den < 22 && mes == 9)) {
            System.out.println("Virgo");
        } else if ((den > 23 && mes == 9) || (den < 23 && mes == 10)) {
            System.out.println("Scales");
        } else if ((den > 24 && mes == 10) || (den < 22 && mes == 11)) {
            System.out.println("Scorpion");
        } else if ((den > 23 && mes == 11) || (den < 21 && mes == 12)) {
            System.out.println("Sagittarius");
        } else if ((den > 21 && mes == 12) || (den < 19 && mes == 1)) {
            System.out.println("Capricorn");
        }
        if (y==0) {
            System.out.println("Monkey");
        } else if (y==1) {
            System.out.println("Rooster");
        } else if (y==2) {
            System.out.println("Dog");
        } else if (y==3) {
            System.out.println("Pig");
        } else if (y==4) {
            System.out.println("Rat");
        } else if (y==5) {
            System.out.println("Ox");
        } else if (y==6) {
            System.out.println("Tiger");
        } else if (y==7) {
            System.out.println("Rabbit\n" + "Cat");
        } else if (y==8) {
            System.out.println("Dragon");
        } else if (y==9) {
            System.out.println("Snake");
        } else if (y==10) {
            System.out.println("Horse");
        } else if (y==11) {
            System.out.println("Goat");
        }
} }
