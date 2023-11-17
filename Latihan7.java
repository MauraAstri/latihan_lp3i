import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
    

        // Masukan nilai
         System.out.println("Masukan nilai UTS :");
        int UTS = scan.nextInt();
         System.out.println("Masukan nilai UAS :");
       int UAS = scan.nextInt();
         System.out.println("Masukan nilai Tugas :");
        int Tugas = scan.nextInt();

        // Nilai akhir
        double nilai_akhir = 0.3 * UTS + 0.5 * UAS + 0.2 * Tugas;
         System.out.println("Nilai akhir :"+nilai_akhir);



    }
}
