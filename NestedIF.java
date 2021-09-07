package bisdi.pertemuan02;

public class NestedIF {
    public static void main(String[] args){
        int i = 90;
        int j = 50;
        int k = 30;

        System.out.println("Nilai i: "+i);
        System.out.println("Nilai j: "+j);
        System.out.println("Nilai k: "+k);

        if (i > k){
            if (j > k)
                System.out.println("i dan j lebih besar dari k");
        }
        else
            System.out.println("i kurang dari atau sama dengan k");
    }
}

