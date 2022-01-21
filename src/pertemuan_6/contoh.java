package pertemuan_6;
import java.util.Scanner;
public class contoh {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int n,hasil;

        System.out.print("n = ");
        n = input.nextInt();
        hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil = hasil + i;
            System.out.print(i + " + ");
        }
        System.out.println();
        System.out.println("total ="+hasil);
    

    }
    
}
