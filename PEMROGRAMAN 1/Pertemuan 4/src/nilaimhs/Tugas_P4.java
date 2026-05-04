package nilaimhs;
import java.util.Scanner;
public class Tugas_P4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Makan : ");
        int makan = input.nextInt();

        System.out.print("Transportasi : ");
        int trans = input.nextInt();

        System.out.print("Belanja : ");
        int belanja = input.nextInt();

        int pengeluaran = makan + trans + belanja;

        double total_makan = ((double)makan / pengeluaran) * 100;
        double total_trans = ((double)trans / pengeluaran) * 100;
        double total_belanja = ((double)belanja / pengeluaran) * 100;

        System.out.printf("Pengeluaran makan : %.2f%%\n", total_makan);
        System.out.printf("Pengeluaran transportasi : %.2f%%\n", total_trans);
        System.out.printf("Pengeluaran belanja : %.2f%%\n", total_belanja);
    }
    
}
