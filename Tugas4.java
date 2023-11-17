import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka yang dikonversi :");
        angka = scan.nextInt();

        switch(angka){
            case 0 :
            //case "a":
                System.out.println("0 = 0");
                break;
            case 1 :
                System.out.println("1 =  I");
                break;
            case 2 :
                System.out.println("2 = II");
                break;
            case 3 :
                System.out.println("3 = III");
                break;
            case 4 :
                System.out.println("4 = IV");
                break;
            case 5 :
                System.out.println("5 = V");
                break;
            case 6 :
                System.out.println("6 = VI");
                break;
            case 7 :
                System.out.println("7 = VII");
                break;
            case 8:
                System.out.println("8 = VIII");
                break;
            case 9 :
                System.out.println("9 = IX");
                break;
            case 10 :
                System.out.println("10 = X");
                break; 
            default :
                System.out.println("Angka inputan salah!");
                break;
        }
        scan.close();
    }
}  


