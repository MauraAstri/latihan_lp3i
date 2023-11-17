import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai = scan.nextInt();
        System.out.println("Masukan nilai panjang ="+nilai);

        int m = nilai * 1000;
        int cm = nilai * 10000;

        System.out.println("Nilai m:"+m);
         System.out.println("Nilai cm:"+cm);
    }
}
