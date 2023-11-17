import java.util.Scanner;

public class Tugas3 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int Nilai = scan.nextInt();
    System.out.println("Masukan nilai :"+Nilai);

    
    // Cetak nilai kelulusan
    if (Nilai > 70) {
        System.out.println("Kamu lulus.");

        
    }else{
        System.out.println("Kamu tidak lulus.");
    }

   } 
}
