package pertemuan_7;

import javax.swing.JOptionPane;

public class tugas1_hitungN {

    public static void main(String[] args) {
        int bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan"));
        int a,b = 0;
        for(a=0;a<=bil;a++){
            b+=a;
            if(a==0){
                System.out.println("n = "+bil);
            }
            else if(a>0){
                System.out.print(a+" + ");
            }
            if(a==b){
                System.out.println();
                System.out.println("Total = "+b);
            }
        }
    }
    
}
