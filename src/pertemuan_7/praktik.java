package pertemuan_7;

import javax.swing.JOptionPane;

public class praktik {

    public static void main(String[] args) {
        
//        System.out.println("Angka indeks ke 1 = " +a1);
//        
//        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 2 = " +a2);
//        
//        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 3 = " +a3);
//
//        int a4 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 4 = " +a4);
//
//        int a5 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 5 = " +a5);
//
//        int a6 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 6 = " +a6);
//
//        int a7 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pada indeks ke 1"));
//        System.out.println("Angka indeks ke 7 = " +7);

        int elemen;
        JOptionPane.showInputDialog("Program sederhana input adata nama mahasisiwa");
        elemen = Integer.parseInt(JOptionPane.showInputDialog("Berapa julah data nama mhs"));
        
        String namaMahasiswa [] = new String [elemen];
        
        for (int index = 0; index < elemen; index++); {
            namaMahasiswa[index] = JOptionPane.showInputDialog("Input nama ideks ke- " +index);
    }   
    }
}
