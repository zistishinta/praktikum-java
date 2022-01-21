
package pertemuan_7;

public class coba_2dimensi {
    
    public static void main(String[] args) {
        int jmlData = 4;
        int jmlField =  3;
        String namaMhs [] = new String [jmlData];
        String Id [] [] = new String [jmlData] [jmlField];
        
        namaMhs [0] = "Agus"; //namamhs1
        namaMhs [1] = "Salim"; //namaMhs2
        namaMhs [2] = "Bobi"; //namaMhs3
        
        Id [0] [0] = "50";  //berat badan
        Id [0] [1] = "170"; //tingibadan
        Id [0] [2] = "22";  //umur mahasiswa
        
        Id [1] [0] = "60";  //BB mahsasiswa ke-2
        Id [1] [1] = "60";  //TB mahsasiswa ke-2 
        Id [1] [2] = "24";  //BB mahsasiswa ke-2
                
        Id [2] [0] = "65";  //BB mahsasiswa ke-3
        Id [2] [1] = "180"; //TB mahsasiswa k3-3
        Id [2] [2] = "23";  //BB mahsasiswa k3-3
        
        //mencetak data mhs yang pertama
        System.out.println("===================");
        System.out.println("Nama Mahasiswa = " +namaMhs [0]);
        System.out.println("===================");
        System.out.println("Berat Badan = " +Id [0] [0] );
        System.out.println("Tinggi Badan = " +Id [1] [0]);
        System.out.println("Umur = " +Id [2][0]);
        
        }
    
}
