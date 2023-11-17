import java.util.Scanner;
public class Tugas1 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int total_belanja;

    System.out.println("Masukan total belanja :");
    total_belanja = scan.nextInt();

if (total_belanja > 1500000) {
    System.out.println("dapat bracket tv");
}else if (total_belanja > 500000) {
    System.out.println("dapat sound bar");
}else{
    System.out.println("tidak dapat bonus");
}
    scan.close();
}
    
}