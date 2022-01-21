package pertemuan_2;

public class praktik {

    public static void main(String[] args) {
        int a=2,b=3,c=3,d=15, e=10, f =3, k=3, g=2;
        int hasil, operator;
        double uang, lingkaran, derajat, hs;
        String aksi;
        //------------------------------------
        aksi = "menambah dengan dirinya sendiri ";
        a +=a;
        System.out.println(aksi);
        System.out.println("hasil a= "+a);
        System.out.println("");
        //------------------------------------
        aksi = "perpangkatan";
        a = (int) Math.pow(a, b);
        System.out.println(aksi);
        System.out.println("hasil a = "+a);
        //-----------------------------------
        aksi = "hasil bagi jika terbalik";
        hasil = b/d;
        System.out.println(aksi);
        System.out.println("hasil bagi 2/15"+hasil);
        System.out.println("");
        //-----------------------------------
        aksi = "bulatkan 50 rupiah";
        uang = 15350;
        System.out.println(aksi);
        System.out.println("pembulatan 15350 jadi = "+ Math.round(uang/100)* 100); //dibulatkan jadi desimal dengan dibagi 100
        System.out.println("");
        //-----------------------------------
        aksi = "menggunakan pi (hitung luas lingkaran)";
        lingkaran = Math.PI * Math.pow(e, b);
        System.out.println(aksi);
        System.out.println("luas lingkaran jari-jari" + e + "=" +lingkaran);
        System.out.println("");
        //-----------------------------------
        aksi = "menggunakan derajat dalam matematika (sin30)";
        derajat = Math.toRadians(90);
        hs = Math.sin(derajat);
        System.out.println(aksi);
        System.out.println("sin 90 = " +(int) hs);
        System.out.println("");
        //-----------------------------------
        aksi = "penggunaan pre increment"; //nilai tetap
        int cth1;
        cth1 = c++;
        System.out.println(aksi);
        System.out.println(cth1);
        System.out.println("");
        //-----------------------------------
        aksi = "penggunaan post increment"; //nilai ketambah satu
        int cth2;
        cth2 = ++k;
        System.out.println(aksi);
        System.out.println(cth2);
        System.out.println("");
        //----------------------------------- 
        aksi = "penggunaan pre decrement"; //niali tetap
        int cth3;
        cth3 = b--;
        System.out.println(aksi);
        System.out.println(cth3);
        System.out.println("");
        //-----------------------------------
        aksi = "penggunaan post decrement"; //nilai terkurang 1
        int cth4;
        cth4 = --c;
        System.out.println(aksi);
        System.out.println(cth2);
        System.out.println("");
    }
    
}
