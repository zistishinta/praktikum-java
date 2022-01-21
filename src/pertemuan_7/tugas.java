package pertemuan_7;
import javax.swing.*;
public class tugas {
    public static void main(String[] args) {

        int input=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Data Siswa:"));
        System.out.println("============================================================");
            System.out.println("\tData Nilai Siswa");
            System.out.println("No\tNama\tUlangan\tTugas\tTotal\tRata2");
            System.out.println("============================================================");
        for(int a=0;a<input;a++){
            String nama[]=new String[input];
            double nilai[][]=new double[input][4];
            nama[a]=JOptionPane.showInputDialog("Masukkan Nama Siswa:");
            for(int b=0;b<4;b++){
                if(b==0){
                    nilai[a][b]=Integer.parseInt(JOptionPane.showInputDialog
                                ("Masukkan Nilai Ulangan "+nama[a]+" : "));
                }
                if(b==1){
                    nilai[a][b]=Integer.parseInt(JOptionPane.showInputDialog
                                ("Masukkan Nilai Tugas "+nama[a]+" : "));
                }
                if(b==2){
                    nilai[a][b]=nilai[a][0]+nilai[a][1];
                }
                if(b==3){
                    nilai[a][b]=nilai[a][2]/2;
                }
            }
            int no=a+1;
            System.out.println(no+"\t"+nama[a]+"\t"+(int)nilai[a][0]+"\t"+(int)nilai[a][1]+"\t"+(int)nilai[a][2]+"\t"+nilai[a][3]);   
        }
    }
}