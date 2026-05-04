package datamahasiswa;
import java.util.Scanner;
public class L1_datamhsP2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.print("Masukan nama      : ");
        String nama = input.nextLine();

        System.out.print("Masukan NIM       : ");
        String nim = input.nextLine();

        System.out.print("Program Studi     : ");
        String prodi = input.nextLine();

        System.out.println("===============================================");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Program Studi   : " + prodi);
    }
    
}
