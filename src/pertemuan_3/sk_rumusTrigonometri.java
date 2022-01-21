package pertemuan_3;
public class sk_rumusTrigonometri {

    public static void main(String[] args) {
        int tinggi  = 96;
        double jarakhorizontal;
        double derajat  = Math.toRadians(60);
        double tanx     = Math.tan(derajat);
        
        jarakhorizontal = tinggi / tanx;
        System.out.println("Jarak Horizontal = "+jarakhorizontal);
    }
    
}
