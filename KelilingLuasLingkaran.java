package bisdi.pertemuan02;

public class KelilingLuasLingkaran {
    public static void main(String[] args){
        final double PI = 3.14;
        double radius = 6.5;

        double keliling = 2 * PI * radius;
        double luas = PI* radius * radius;

        System.out.println("Keliling lingkaran dengan radius "+radius+" adalah "+keliling);
        System.out.println("Luas lingkaran dengan radius "+radius+" adalah "+luas);
    }
}

