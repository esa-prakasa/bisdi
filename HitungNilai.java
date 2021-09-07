package bisdi.pertemuan02;

public class HitungNilai {
    public static void main(String[] args) {
        int score = 71;

        if (score >= 90)
            System.out.println("Grade is A");
        else
            if (score >= 80)
                System.out.println("Grade is B");
            else
                if (score >= 70)
                    System.out.println("Grade is C");
    }
}


