package bisdi.pertemuan02;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 5 == 0)
        System.out.println(number+" is multiple of five");
    if (number % 2 == 0)
        System.out.println(number+" is an even number");
    }
}
