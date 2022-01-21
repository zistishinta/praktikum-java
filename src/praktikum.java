import javax.swing.JOptionPane;
public class praktikum {
    public static void main(String[] args) {
        int deluxeRoom = 275000;
        int suiteRoom = 300000;
        int precidentRoom = 375000;
        int lamainap, pesankamar, jeniskamar, pilihkamar = 0;
        int hrg = 0, hrgdeluxe, hrgsuite, hrgprecident, diskonmember, diskonnon, status=0;
        int total, totalbayar;
        
        System.out.println("          HOTEL ABADI             ");
        System.out.println("--------------NOTA----------------");
        System.out.println("Kamar 1"
                + "\nJenis        : Deluxe Room"
                + "\nTarif penginapaan    : Rp. 275.000/hari");
        System.out.println("----------------------------------");
        System.out.println("Kamar 2"
                + "\nJenis        : Suite Room "
                + "\nTarif penginapaan    : Rp. 300.000/hari");
        System.out.println("----------------------------------");
        System.out.println("Kamar 3"
                + "\nJenis        : Precident Room" 
                + "\nTarif penginapaan    : Rp. 375.000/hari");
        
        
        lamainap = Integer.parseInt(JOptionPane.showInputDialog("Lama Menginap"));
        pesankamar = Integer.parseInt(JOptionPane.showInputDialog("Berapa banyak kamar yang dipesan"));
        jeniskamar = Integer.parseInt(JOptionPane.showInputDialog("Pilih jenis kamar 1 : "
                + "\n1. Deluxe Room Rp. 275.000/hari"
                + "\n2. Suite Room Rp. 3000.000/hari"
                + "\n3. President Room Rp. 370.000/hari"));
        if (jeniskamar == 1) { 
            hrg = 275;
        } if (jeniskamar == 2) {
            hrg = 300;
        } if (jeniskamar == 3) {
            hrg = 300;
        }
        
        status = Integer.parseInt(JOptionPane.showInputDialog("Status pelanggan :"
                + "\n 1. Member "
                + "\n 2. Non Member")); 
        if(status == 1) {
            status = (int) (5/100f);
        }
        if (status == 2) {
            status = (int) (25/100f);
        }
        total = lamainap*pesankamar*hrg;
        totalbayar = total*status;
        //HASIL SOUT
        System.out.println("----------------------------------");
        System.out.println("------------Total Akhir----------");
        System.out.println("Jumlah kamar yang dipesam = "+pesankamar);
        System.out.println("Lama menginap             = "+lamainap+" hari");
        System.out.println("Total                     = "+total);
        System.out.println("Diskon                    = "+status);
        System.out.println("Total yang dibayar        = "+totalbayar);    
    }
    
}
