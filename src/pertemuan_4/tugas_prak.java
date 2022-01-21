package pertemuan_4;

import javax.swing.JOptionPane;

public class tugas_prak {

    public static void main(String[] args) {
        double Tugas, UTS, UAS, nilaiAkhir;
        String syarat;
       
            Tugas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai tugas anda:"));
            System.out.println("Tugas = "+(Tugas));
            Tugas =  (Tugas * (20/100f));
            
            UTS = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai UTS"));
            System.out.println("UTS = "+(UTS));
            UTS =  (UTS * (40/100f));
            
            UAS = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai UAS"));
            System.out.println("UAS = "+(UAS));
            UAS =  (UAS * (40/100f));
        
            nilaiAkhir = (Tugas + UTS + UAS);
            
            syarat = (UAS >= 60) && (nilaiAkhir >= 60) ? "Lulus":"Tidak";
            System.out.println("Maka anda dikatakan " +syarat +" dengan Nilai Akhir "+Math.round(nilaiAkhir)); 
    }
    
}
