import java.util.Scanner;

public class problem1_atm  {

    private Integer pin = 12345;
    private boolean ulang = true;
   
    public void validate_pin() {

        Scanner kode = new Scanner(System.in);

        while (ulang) {
            System.out.print("Masukkan Pin ATM Anda: ");
            Integer input = kode.nextInt();

            if (input.equals(pin)) {
                System.out.println("Pin ATM yang Anda Masukkan Benar");
                ulang = false;
            }else {
                System.out.println("Pin ATM yang Anda Masukkan Salah");
            }

        }
        kode.close();
    }


}