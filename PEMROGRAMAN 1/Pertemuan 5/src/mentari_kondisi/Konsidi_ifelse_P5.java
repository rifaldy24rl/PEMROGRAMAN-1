package mentari_kondisi;
import java.util.Scanner;
public class Konsidi_ifelse_P5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "Rifaldy";
        String pass = "12345678";

        System.out.println("::....LOGIN....::");

        System.out.print("Masukan User name : ");
        String user = input.nextLine();

        System.out.print("Masukan Password  : ");
        String pw = input.nextLine();

        if (user.equals(username) && pw.equals(pass)){
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal");
            System.out.println("Username / password SALAH!!!");
        }
    }
}