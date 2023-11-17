import java.util.Scanner;
public class Latihan1 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int total_belanja;

    // user masukan total belanja
    System.out.println("Masukan total belanja :");
    total_belanja = scan.nextInt();

    // cek total nilai belannja
    if (total_belanja > 100000) {
        System.out.println("dapat tas");
        
    }else if (total_belanja > 50000) {
        System.out.println("dapat diskon 5%");
        
    }
    
}
    
}