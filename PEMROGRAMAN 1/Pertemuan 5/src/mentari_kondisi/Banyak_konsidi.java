package mentari_kondisi;
import java.util.Scanner;
public class Banyak_konsidi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai   : ");
        int nilai = input.nextInt();

        if (nilai >= 80 && nilai <= 100){
            System.out.println("Gradde A");

        } else if (nilai >= 70 && nilai <80){
            System.out.println("Grade B");

        }else if (nilai >= 60 && nilai < 70){
            System.out.println("Grade c");

        }else if (nilai >= 55 && nilai < 60){
            System.out.println("Grade D");
            
        }else if (nilai < 55){
            System.out.println("Grade E");
        }
    }
    
}
