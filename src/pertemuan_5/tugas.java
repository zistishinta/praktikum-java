package pertemuan_5;

import javax.swing.*;
public class tugas {
    public static void main(String[] args) {
         
        double gaji = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Gaji:"));
        double makan  = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Uang Makan:"));
        int    anak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Anak:"));
        double masa = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Masa Kerja: (dalam tahun)"));
        double total,TA,bonus;
         
        if(masa<1){
            total=gaji+makan;
            JOptionPane.showMessageDialog(null,"Total Gaji:\n"+(int)total);
        }
        else if((masa>=1)&(masa<=10)){
            if(anak<4){
                TA=anak*100000;
                bonus=0.1*gaji;
                total=gaji+TA+bonus;
                JOptionPane.showMessageDialog(null,"Total Gaji:\n"+(int)total);
            }
            else if(anak>3){
                TA=3*100000;
                bonus=0.1*gaji;
                total=gaji+TA+bonus;
                JOptionPane.showMessageDialog(null,"Total Gaji:\n"+(int)total);
            }
        }
        else if(masa>10){
            if(anak<4){
                TA=anak*150000;
                bonus=0.2*gaji;
                total=gaji+TA+bonus;
                JOptionPane.showMessageDialog(null,"Total Gaji:\n"+(int)total);
            }
            else if(anak>3){
                TA=3*150000;
                bonus=0.2*gaji;
                total=gaji+TA+bonus;
                JOptionPane.showMessageDialog(null,"Total Gaji:\n"+(int)total);
            }
        }
    }
}