import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai;

        // Masukan total belanja
        System.out.println("Masukan nilai :");
        nilai = scan.nextInt();

        // perbandingan 
        if (nilai > 70) {
            System.out.println("Kamu lulus");
            
        }else{
         System.out.println("Kamu tidak lulus");

         }

    }
}
