package pertemuan_6;

import javax.swing.JOptionPane;

public class looping_genapganjil {

    public static void main(String[] args) {
    int hasilnya = 1;
    ; 
    int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
        System.out.println(angka);
    
    for (int a = angka; a > 0; a--) {
        hasilnya *= a;
        if (a == angka) {
            System.out.print("User " +angka+ "! = " +a);
        }
        else {
        System.out.print(" * " +a);
            if(a == 1) {
            System.out.println(" = " +hasilnya);
        } 
        }
        
    }
    }
}
