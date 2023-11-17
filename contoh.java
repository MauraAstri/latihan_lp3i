import java.util.Scanner;
public class contoh {
    public static void main(String[] args) {
       // int nilai = 80;
       Scanner scan = new Scanner (System.in);  
        int nilai;

      
       System.out.println("masukkan nilai :");
       nilai = scan.nextInt();
       
        
        //  cek nilai kelulusan
        if(nilai > 70) {
            System.out.println("Kamu lulus");
            
        }else{
            System.out.println("Kamu mengulang");
        }
    }
}

