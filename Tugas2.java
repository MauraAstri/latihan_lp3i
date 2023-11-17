import java.util.Scanner;
public class Tugas2 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang,lebar,tinggi,sisi,volume,pilih;
        System.out.println("============================================");
        System.out.println("Kalkulator Volume Bangun Ruang");
        System.out.print("============================================");
        System.out.print("\n 1. Kubus\n 2. Balok\n");
        System.out.println("============================================");
        System.out.print("Masukkan Pilihan Anda (1/2):");
        pilih = scan.nextInt();
    
        switch(pilih){
            case 1:
                System.out.print("Masukkan sisi Kubus :");
                sisi = scan.nextInt();
                volume = sisi * sisi * sisi;
                System.out.println("Volume Kubus :"+volume);
            break;
            case 2:
                System.out.print("Masukkan panjang Balok :");
                panjang = scan.nextInt();
                System.out.print("Masukkan lebar Balok :");
                lebar = scan.nextInt();
                System.out.print("Masukkan tinggi Balok :");
                tinggi= scan.nextInt();
                volume = panjang * lebar * tinggi;
                System.out.print("Volume Balok :"+volume);
            break;
            default:
        }
        scan.close();
    }
}
