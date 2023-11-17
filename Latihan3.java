import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int UTS;
        int UAS;
        int Tugas;
        double nilai_akhir;

        // Masukan nilai
        System.out.println("Masukan Nilai UTS:");
        UTS = scan.nextInt();
        System.out.println("Masukan Nilai UAS:");
        UAS = scan.nextInt();
        System.out.println("Masukan Nilai Tugas:");
        Tugas = scan.nextInt();

        // Nilai akhir
        nilai_akhir = 0.3 * UTS + 0.5 * UAS + 0.2 *Tugas;
        System.out.println("Nilai akhir:"+nilai_akhir);

        


    }
}
