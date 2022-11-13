package homeWork9.pr8_2;

import java.util.Scanner;

public class Employee {
    private String familia;
    private String name;
    private int age;
    private String dolgnost;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.proverkaAge();
    }
    public void proverkaAge(){
        System.out.println("Vvedite age dlu proverki: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 100 ||age<18 ){
            System.err.println("Vozrast ne podhodiachiy");
            System.out.println("Povtorite vvod age: ");
            sc.nextInt();
        } else {
            System.out.println("Vozrast podxodit!!!");
        }
    }
}
