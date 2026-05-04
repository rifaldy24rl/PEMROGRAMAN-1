package nilai_mahasiswa;
import java.util.Scanner;
public class Tugas_Grade_P7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPertemuan = 21;

        System.out.println("=== Program Hitung Nilai Akhir & Grade ===");
        
        // Input Data
        System.out.print("Masukkan jumlah kehadiran : ");
        int hadir = input.nextInt();
        
        System.out.print("Masukkan nilai tugas     : ");
        float tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS       : ");
        float uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS       : ");
        float uas = input.nextFloat();

        // 1. Hitung Bobot Nilai (Logika Codingan 2)
        float skorPresensi = (hadir / (float) totalPertemuan) * 10; // Bobot 10%
        float skorTugas = tugas * 20 / 100;                        // Bobot 20%
        float skorUTS = uts * 30 / 100;                            // Bobot 30%
        float skorUAS = uas * 40 / 100;                            // Bobot 40%

        double totalNilai = skorPresensi + skorTugas + skorUTS + skorUAS;
        double persenHadir = (hadir / (double) totalPertemuan) * 100;

        // 2. Tampilkan Hasil Analisis
        System.out.println("\n--- Hasil Analisis ---");
        System.out.printf("Persentase Kehadiran : %.2f%%\n", persenHadir);
        System.out.printf("Total Nilai Akhir    : %.2f\n", totalNilai);

        // 3. Penentuan Grade (Logika Codingan 1)
        if (persenHadir < 75.0) {
            System.out.println("Status : TIDAK LULUS (Kehadiran kurang dari 75%)");
            System.out.println("Grade  : E (Otomatis karena absen)");
        } else {
            String grade;
            if (totalNilai >= 80) {
                grade = "A";
            } else if (totalNilai >= 70) {
                grade = "B";
            } else if (totalNilai >= 60) {
                grade = "C";
            } else if (totalNilai >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }
            
            System.out.println("Status : Kehadiran Cukup");
            System.out.println("Grade  : " + grade);
        }
        
        System.out.println("==========================================");
        input.close();
    }
    
}
