import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int total_belanja;
        

        // user memasukan nilai total belanja 
        System.out.println("Masukan Total Nilai Belanja :");
        total_belanja = scan.nextInt();

        // cek total nilai belanja 
        if(total_belanja > 5000000) {
            System.out.println("dapat sound bar");
        }else if(total_belanja > 1500000){
            System.out.println("dapat bracket tv");
        }
       
        scan.close();
    }
}
