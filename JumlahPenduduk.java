package bisdi.pertemuan02;

public class JumlahPenduduk {
    public static void main(String[] args){
        final int HARI_PER_TAHUN = 365;
        final double LAJU_LAHIR = 1.0/7;  // 1 kelahiran tiap 7 detik
        final double LAJU_MATI = 1.0/13;  // 1 kematian tiap 13 detik
        final double LAJU_IMIGRAN = 1.0/45; // 1 imigran masuk tiap 45 detik
        int jumlahPendudukSaatIni = 312032486;
        System.out.printf("%2.4f\n",LAJU_LAHIR);
        System.out.printf("%2.4f\n",LAJU_MATI);
        System.out.printf("%2.4f\n",LAJU_IMIGRAN);

        int jumlahDetikPerTahun = 60 * 60 * 24 * HARI_PER_TAHUN;
        double jumlahPertambahanPenduduk5Tahun = 5 *jumlahDetikPerTahun * (LAJU_LAHIR + LAJU_IMIGRAN - LAJU_MATI);
        int jumlahPertambahan5TahunInt = (int) jumlahPertambahanPenduduk5Tahun;

        System.out.println("Jumlah Pertambahan Penduduk setelah 5 tahun (Bil REAL): ");
        System.out.printf("%,f\n",jumlahPertambahanPenduduk5Tahun);
        System.out.println("Jumlah Pertambahan Penduduk setelah 5 tahun (Bil BULAT): ");
        System.out.printf("%,d\n",jumlahPertambahan5TahunInt);
    }
}


