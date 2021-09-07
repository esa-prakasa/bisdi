package bisdi.pertemuan02;

import java.util.Scanner;

public class TampilkanInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Berikan sebuah bilangan bulat (integer)! ");
        int bilangan = input.nextInt();
        System.out.println("Bilangan yang diberikan adalah "+bilangan);
    }
}


