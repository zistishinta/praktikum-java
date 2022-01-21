package pertemuan_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas_nilaiAkhir_bufferedReader {

    public static void main(String[] args) throws IOException {
        String nama;
        Long nim;
        double Tugas, Kuis, UTS, UAS, nilaiAkhir;
        int tugas1, tugas2, tugas3;
        
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan Nama Lengkap = ");
        nama = (data.readLine());
        
        System.out.println("Masukkan NIM = ");
        nim = Long.parseLong(data.readLine());
        System.out.println("");
        
        System.out.println("Masukkan nilai tugas 1 = ");
        tugas1 = Integer.parseInt(data.readLine());
        System.out.println("");

        System.out.println("Masukkan nilai tugas 2 = ");
        tugas2 = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Masukkan nilai tugas 3 = ");
        tugas3 = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Nilai Kuis");
        Kuis = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Nilai UTS");
        UTS = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Nilai UAS");
        UAS = Integer.parseInt(data.readLine());
        System.out.println("");
        
        Tugas = (tugas1 + tugas2 + tugas3) * 0.15;   //dibulatkan pisan
        Kuis = Kuis * 0.20;
        UTS = UTS * 0.30;
        UAS = UAS * 0.35;
        
        nilaiAkhir = Tugas + Kuis + UTS + UAS;
        System.out.println("\nNilai akhir = " +(int)nilaiAkhir);
        
        
    }
    
}
