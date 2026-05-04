package perulangan;
import java.util.Scanner;
public class Latihan1_Loopingdowhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            // 1. Menginput nilai mahasiswa
            System.out.println("--- Input Nilai Mahasiswa ---");
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan Nilai: ");
            double nilai = input.nextDouble();
            input.nextLine(); // Membersihkan buffer setelah input angka

            // 2. Menampilkan nilai yang diinput
            System.out.println("\nData Berhasil Disimpan:");
            System.out.println("Nama    : " + nama);
            System.out.println("Nilai   : " + nilai);
            System.out.println("---------------------------");

            // 3 & 4. Mengulangi input atau berhenti jika user pilih 't'
            System.out.print("Apakah ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
            input.nextLine(); // Membersihkan buffer lagi
            System.out.println();

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}