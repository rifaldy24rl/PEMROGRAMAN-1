package perulangan;
import java.util.Scanner;
public class Latihan2_Loopingdowhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilai = 0; // Variabel untuk menjumlahkan semua nilai
        int jumlahData = 0;    // Opsional: untuk menghitung berapa kali input
        char pilihan;

        do {
            // 1. Menginput nilai mahasiswa
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (jumlahData + 1) + ": ");
            double nilai = input.nextDouble();
            
            // 3. Menjumlahkan semua nilai yang diinput
            totalNilai += nilai; 
            jumlahData++;

            // 2. Mengulangi input dengan do-while
            System.out.print("Input nilai lagi? (y/t): ");
            pilihan = input.next().charAt(0);
            System.out.println("---------------------------");

        } while (pilihan == 'y' || pilihan == 'Y'); // 4. Berhenti jika memilih t

        // Menampilkan total nilai di akhir
        System.out.println("HASIL AKHIR:");
        System.out.println("Total Mahasiswa : " + jumlahData);
        System.out.println("Total Seluruh Nilai : " + totalNilai);
        
        // Bonus: Menghitung rata-rata
        if (jumlahData > 0) {
            double rataRata = totalNilai / jumlahData;
            System.out.println("Rata-rata Nilai     : " + rataRata);
        }

        input.close();
    }
    
}
