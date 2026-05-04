package nilai_mahasiswa;
import java.util.Scanner;
public class L_Grade_P7 {

    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);

        byte var2 = 21;
      System.out.println("=== Program Cek Grade Mahasiswa ===");
      System.out.print("Masukkan jumlah kehadiran : ");
      int var3 = var1.nextInt();
      System.out.print("Masukkan nilai : ");
      double var4 = var1.nextDouble();
      double var6 = (double)var3 / (double)var2 * (double)100.0F;
      System.out.println("\n--- Hasil Analisis ---");
      System.out.printf("Persentase Kehadiran: %.2f%%\n", var6);
      if (var6 < (double)75.0F) {
         System.out.println("Status : TIDAK LULUS (Kehadiran kurang dari 75%)");
         System.out.println("Grade : E (Otomatis karena absen)");
      } else {
         String var8;
         if (var4 >= (double)80.0F && var4 <= (double)100.0F) {
            var8 = "A";
         } else if (var4 >= (double)70.0F && var4 < (double)80.0F) {
            var8 = "B";
         } else if (var4 >= (double)60.0F && var4 < (double)70.0F) {
            var8 = "C";
         } else if (var4 >= (double)55.0F && var4 < (double)60.0F) {
            var8 = "D";
         } else {
            var8 = "E";
         }

         System.out.println("Status: Kehadiran Cukup");
         System.out.println("Grade Akhir : " + var8);
      }

      System.out.println("====================================");
      var1.close();
    }
    
}
