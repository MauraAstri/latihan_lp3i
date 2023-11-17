import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int UTS;
         int UAS;
         int Tugas;
         double Nilai_akhir;

        //  Masukan nilai 
          System.out.println("Masukan nilai UTS:");
         UTS = scan.nextInt();
          System.out.println("Masukan nilai UAS :");
         UAS = scan.nextInt();
          System.out.println("Masukan nilai Tugas:");
         Tugas = scan.nextInt();
          
        //  nilai akhir
         Nilai_akhir = 0.3 *  UTS + 0.5 * UAS + 0.2 * Tugas; 
          System.out.println("Nilai akhir:"+Nilai_akhir);

         
         
    }
    
}