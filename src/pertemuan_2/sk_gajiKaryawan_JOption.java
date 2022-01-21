package pertemuan_2;

import javax.swing.JOptionPane;

public class sk_gajiKaryawan_JOption {
    public static void main(String[] args) {
        int gaji_pokok, jml_anak;
        double tunj_suis;
        String total_tunjsuis;
        float tunj_anak;
        double bruto;
        double netto;
        double iuran_pensiun;
        
        gaji_pokok = Integer.parseInt(JOptionPane.showInputDialog("Masukan gaji pokok anda sekarang"));
            System.out.println("Gaji anda = "+gaji_pokok);
        
        tunj_suis =  10/100f * gaji_pokok; 
            System.out.println("Tunjangan suami istri = " +tunj_suis);
        
        jml_anak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah anak"));
        tunj_anak = jml_anak * (2/100f * gaji_pokok);
            System.out.println("Tunjangan anak = " +tunj_anak);
            
        bruto = tunj_suis + tunj_anak + gaji_pokok;
            System.out.println("Penghasilan Bruto/bulan = " +bruto);
        
        iuran_pensiun = 4/100f * gaji_pokok;    
            System.out.println("Iuran pensiun = " +iuran_pensiun);
            
        netto = bruto - iuran_pensiun;
        System.out.println("Penghasilan Netto/bulan = " +netto);
    }
}       
