import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner kode = new Scanner(System.in);

        System.out.print("\nMasukkan Angka yang Anda Inginkan: ");
        int input = kode.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));

        }
        kode.close();
    }
}
