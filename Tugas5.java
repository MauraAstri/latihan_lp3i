import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        double jumlah=0;
        System.out.print("jumlah N :");
        int n = scan.nextInt();
        float arr[] = new float[n];
        while(i<n) {
            arr[i] = scan.nextInt();
            jumlah=jumlah+arr[i];
            i++;
        }
        double rata_rata = jumlah/n;
        System.out.println("Rata - Rata : "+rata_rata);

        scan.close();
    }
}
