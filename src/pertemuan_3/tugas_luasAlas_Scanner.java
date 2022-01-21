package pertemuan_3;

import  java.io.*;
import java.util.Scanner;

public class tugas_luasAlas_Scanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume, panjang, lebar, luas_alas, tinggi;
        
        System.out.print("Panjang = ");
        panjang = in.nextInt();
        System.out.println("");
        
        System.out.print("Lebar = ");
        lebar = in.nextInt();
        System.out.println("");
        
        System.out.print("Volume = ");
        volume = in.nextInt();
        System.out.println("");
               
        luas_alas = panjang * lebar;
         
        tinggi = volume / luas_alas;
        System.out.println("Tinggi taung = " +tinggi);
    }
    
}

