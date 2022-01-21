package pertemuan_2;
public class tugas {

    public static void main(String[] args) {
        //soal 1 menghitung jari-jari, luas alas, volume. t=10,d=15. Math PI. Math Pow
        int t = 10;
        int d = 15;
        double jari_jari = 15/2f;
        double luas_alas;
        double volume;
        
        System.out.println("A. Jari-jari = "+jari_jari);
        
        luas_alas = (int) (Math.PI * jari_jari * jari_jari);
        System.out.println("B. Luas alas =  "+luas_alas);
        
        volume = (int) (Math.PI * Math.pow(jari_jari, 2) * t);
        System.out.println("C. Volume = "+volume);
        System.out.println("");
        
        
        //no 2
        int kode1 = 001;
        int kode2 = 002;
        int kode3 = 003;
        double subtotal;
        int total;
        int totalsemua;
        double  diskon;
        
        String nama1 = "Buku";
        String nama2 = "Pensil";
        String nama3 = "Bolpoin";
        
        int stok1 = 10;
        int stok2 = 20;
        int stok3 = 25;
        
        int harga1 = 3000;
        int harga2 = 2000;
        int harga3 = 2500;
        

        subtotal    = stok1 * (harga1 - 0.2);
            System.out.println("Subtotal A = "+Math.round(subtotal));
        subtotal = stok2 * (harga2 - (0.1));
            System.out.println("Subtotal B = "+Math.round(subtotal));
        subtotal = stok3 * (harga3 - (0.15));
            System.out.println("Subtotal C = "+Math.round(subtotal));
       
    }
    
}
