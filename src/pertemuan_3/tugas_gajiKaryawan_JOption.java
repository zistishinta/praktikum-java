package pertemuan_3;

import javax.swing.JOptionPane;

public class tugas_gajiKaryawan_JOption {
    public static void main(String[] args) {
        int gaji_pokok = 0, jml_anak = 0;
        double tunj_suis = 0, tunj_anak, iuran_pensiun, bruto, netto;
        String total_tunjsuis;
        
        int punya = JOptionPane.showConfirmDialog(null, "Apakah andan punya suami /istri ?", null, 0);
        
        
        punya = (punya == 0)? 1:0;
            gaji_pokok = Integer.parseInt(JOptionPane.showInputDialog("Masukan gaji pokok anda sekarang"));
            System.out.println("Gaji anda               = Rp. "+gaji_pokok);
            
            tunj_suis =  (gaji_pokok * (10/100f));
            System.out.println("Tunjangan suami istri   = Rp.  "+tunj_suis);
            
            jml_anak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah anak"));
            tunj_anak = jml_anak * ((2/100f) * gaji_pokok);
            System.out.println("Tunjangan anak          = Rp.  " +tunj_anak);
        
            System.out.println("----------------------------------------- +");
            bruto = (tunj_suis + tunj_anak) + gaji_pokok;
            System.out.println("Penghasilan Bruto/bulan = Rp.  " +bruto);
            
            System.out.println("");
            iuran_pensiun = ((4/100f) * gaji_pokok); 
            System.out.println("Iuran pensiun           = Rp.  " +iuran_pensiun);
            
            System.out.println("----------------------------------------- -"); 
            netto = bruto - iuran_pensiun;
            System.out.println("Penghasilan Netto/bulan = Rp.  " +Math.round(netto));
        
        punya = (punya == 1)? 1:0;
            tunj_anak = jml_anak * ((2/100f) * gaji_pokok);
            System.out.println("Tunjangan anak          = Rp.  " +tunj_anak);
        
            System.out.println("----------------------------------------- +");
            bruto = (tunj_suis + tunj_anak) + gaji_pokok;
            System.out.println("Penghasilan Bruto/bulan = Rp.  " +bruto);
            
            System.out.println("");
            iuran_pensiun = ((4/100f) * gaji_pokok); 
            System.out.println("Iuran pensiun           = " +iuran_pensiun);
            
            System.out.println("----------------------------------------- -"); 
            netto = bruto - iuran_pensiun;
            System.out.println("Penghasilan Netto/bulan = " +Math.round(netto));
        }
    }   
