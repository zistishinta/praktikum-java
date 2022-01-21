package pertemuan_5;

import javax.swing.JOptionPane;

public class tugas_ifandswitchCase {
    public static void main(String[] args) {
        int makanan = 0;
        int minuman = 0;
        String inputawal;
        
        inputawal = JOptionPane.showInputDialog("1. Makanan saja"+"\n2. Minuman saja"+"\n3.Minuman makanan");
        makanan = Integer.parseInt(JOptionPane.showInputDialog("Makanan"));
        switch(makanan) {
            case 1: 
                System.out.println("1. Soto"); break;
            case 2:
                System.out.println("2. Rawon"); break;
            case 3:
                System.out.println("3. Pecel"); break;
            default :
                System.out.println("Tidak ada menu yang anda pilih");
        }
        
        minuman = Integer.parseInt(JOptionPane.showInputDialog("Minuman"+"\n1. Es teh"+"\n2.Es Susu"+"\n 3.Es campur"));
        switch(minuman) {
            case 1:
                System.out.println("1. Es teh");    break;
            case 2:
                System.out.println("2. Es susu");   break;
            case 3:
                System.out.println("3. Es campur"); break;
        }

        
    }
}