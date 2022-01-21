package pertemuan_7;

import javax.swing.JOptionPane;

public class sk_inputan {

    public static void main(String[] args) {
        JOptionPane.showInputDialog(null, "Input Data Mahasiswa");
        int jmlBaris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah data"));
        
        String mhs [] [] = new String [jmlBaris] [3]; //ada 3 kolom
        
        for (int baris = 0; baris < jmlBaris; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                if (kolom == 0) {
                    mhs [baris] [0] = JOptionPane.showInputDialog("Nama " +kolom); 
                }
                if (kolom == 1) {
                    mhs [baris] [1] = JOptionPane.showInputDialog("Alamat " +kolom);
                }
                if (kolom == 2) {
                    mhs [baris] [2] = JOptionPane.showInputDialog("Umur " +kolom);
                }
            }
        }
        System.out.println("Nama mahaisiwa" [baris][0]);
    }
    
}
