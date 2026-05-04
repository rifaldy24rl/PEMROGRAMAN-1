package perulangan;
import java.util.Scanner;
public class L1_Looping_P8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LATIHAN 1");
        int a;
    
        System.out.print("Masukan batasan : ");
        int b = input.nextInt();
    
        for(a = 1; a <= b; a++){
            System.out.println("Hasil Perulangan dengan for : " + a);
        }
    }
    
}
