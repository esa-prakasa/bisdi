package bisdi.pertemuan02;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai radius : ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("Luas area lingkaran dengan jari-jari "+radius+" adalah "+area);
    }
}
