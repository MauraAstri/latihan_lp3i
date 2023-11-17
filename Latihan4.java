import java.util.Scanner;
/**
 * Latihan4
 */
public class Latihan4 {
public 
 void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int UAS;
    int UTS;
    int Tugas;
    double nilai_akhir;

    // Masukan nilai
     System.out.println("Masukan nilai UAS:");
    UAS = scan.nextInt();
     System.out.println("Masukan nilai UTS:");
    UTS = scan.nextInt();
     System.out.println("Masukan nilai Tugas:");
    Tugas = scan.nextInt();

    // Nilai Akhir
    nilai_akhir = 0.3 * UAS + 0.3 * UTS + 0.2 * Tugas;
    System.out.println("Nilai akhir"+nilai_akhir);
}
    
}