package pertemuan_6;
import javax.swing.JOptionPane;
public class tugas2_kasirMinimarket {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama Kasir : ");
        int jenis = Integer.parseInt(JOptionPane.showInputDialog("Banyak Barang : "));
        int a,total = 0;
        
        System.out.println("-----MINIMARKET SAYA-----");
        System.out.println("Petugas Kasir : "+nama);
        System.out.println("Banyak Barang : "+jenis);
        System.out.println();
    
        for (a=1; a<=jenis; a++){
            String barang = JOptionPane.showInputDialog("Nama Barang : ");
            int harga = Integer.parseInt(JOptionPane.showInputDialog("Harga Barang : "));
            int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Barang : "));
            total += harga*jumlah;
            System.out.println("-----Pesanan Ke-"+a+"-----");
            System.out.println("Nama Barang : "+barang);
            System.out.println("Harga        : Rp."+harga);
            System.out.println("Banyak        : "+jumlah);
            System.out.println();
        }
        
        int tambah = JOptionPane.showConfirmDialog(null,"Apakah ada Pesanan Lainnya?");
        if(tambah==0){
            int x;
            for(x=1;x<2;x++){
            int jenis2 = Integer.parseInt
            (JOptionPane.showInputDialog("Banyak Barang Yang Ditambahkan : "));
            System.out.println("Banyak Jenis Barang Tambahan : "+jenis2);
            int b,c=jenis+1,total2=0;
            jenis2+=c;
            for(b=c;b<jenis2;b++){
            String barang2 = JOptionPane.showInputDialog("Masukkan Nama Barang : ");
            int    harga2  = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang : "));
            int    jumlah2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang : "));
            total2+=harga2*jumlah2;
            System.out.println("-----Pesanan Ke-"+b+"-----");
            System.out.println("Nama Barang  : "+barang2); 
            System.out.println("Harga        : Rp."+harga2);
            System.out.println("Banyak       : "+jumlah2);            
            }
            int tambah2 = JOptionPane.showConfirmDialog(null,"Apakah ada Pesanan Lainnya?");
            if(tambah2==0){
                x--;
            }
            if(tambah2==1){
                int total3=total+total2;
                System.out.println();
                System.out.println("Total Semuanya : Rp."+total3);
            }
            }
        }
        else if(tambah==1){
            System.out.println("Total Semuanya : Rp."+total);
        }
    }
    
}
