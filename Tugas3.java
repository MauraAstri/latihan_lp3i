import java.util.Scanner;
public class Tugas3 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah,harga,pilih;
        System.out.println("===========Restoran Pasti Laku===========");
        System.out.print("Paket Menu : ");
        System.out.print("\n 1. Nasi Goreng + Telur dadar  : Rp 25.000\n 2. Nasi Goreng + Sate ayam    : Rp 35.000\n 3. Nasi Uduk + Ayam goreng    : Rp 20.000\n 4. Nasi Kebuli + Ayam goreng  : Rp 30.000\n");
        System.out.println("=========================================");
        System.out.print("Pilih Menu Anda 1-4 :");
        pilih = scan.nextInt();
    
        switch(pilih){
            case 1:
                System.out.print("Masukkan jumlah pesanan :");
                jumlah = scan.nextInt();
                harga = jumlah * 25000;
               System.out.print("Total pesanan :"+harga);
            break;
            case 2:
                System.out.print("Masukkan jumlah pesanan :");
                jumlah = scan.nextInt();
                harga = jumlah * 35000;
                System.out.print("Total pesanan :"+harga);
            break;
            case 3:
                System.out.print("Masukkan jumlah pesanan :");
                jumlah = scan.nextInt();
                harga = jumlah * 20000;
                System.out.print("Total pesanan :"+harga);
            break;
            case 4:
                System.out.print("Masukkan jumlah pesanan :");
                jumlah = scan.nextInt();
                harga = jumlah * 30000;
                System.out.print("Total pesanan :"+harga);
            break;
            default:
        }
        scan.close();
    }
}

