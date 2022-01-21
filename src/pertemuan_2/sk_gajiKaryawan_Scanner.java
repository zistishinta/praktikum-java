package pertemuan_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sk_gajiKaryawan_Scanner{

    public static void main(String[] args) throws IOException { //jangan lupa throws IOException
        int gaji, jml_anak;
        double tunj_suis, tunj_anak, iuran_pensiun, bruto, netto;
        
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Gaji Pokok : ");
        gaji = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Jumlah anak : ");
        jml_anak = Integer.parseInt(data.readLine());
        System.out.println("");
        
        System.out.println("Tunjangan Suami Istri (10% dari gaji pokok)");
        tunj_suis = gaji*(10/100f);
        System.out.println(tunj_suis);
        System.out.println("");
        
        System.out.println("Tunjungan Anak = ");
        tunj_anak = (gaji * (20/100f)) * jml_anak;
        
        System.out.println("Penghasilan Bruto / bulan = ");
        bruto = gaji + tunj_suis + tunj_anak;
        System.out.println(bruto);
        System.out.println("");
        
        System.out.println("Iuran Pensiun (4% gaji pokok)");
        iuran_pensiun = gaji * (4/100f);
        System.out.println(iuran_pensiun);
        System.out.println("");
        
        System.out.println("Penghasilan Netto");
        netto = bruto - iuran_pensiun;
        System.out.println(Math.round(netto));   
        
    }    
}

