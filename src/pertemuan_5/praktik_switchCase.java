
package pertemuan_5;


public class praktik_switchCase {

    public static void main(String[] args) {
        int nilai = 100;
        
        switch (nilai) {
            case 100:
                System.out.println("Sangat bagus!");
                break;
            case 85:
                System.out.println("Bagus!");
                break;
            case 60:
                System.out.println("Kurang belajar!");
                break;
            default:
                System.out.println("Maaf, Anda tidak lulus");
        }

    }
    
}
