import java.util.Scanner;
public class penghasilan_gaji_pegawai {
    public static void main(String[] args) {
        double totalnilai;
        Scanner input = new Scanner(System.in);
        System.out.println("===== Program Menentukan Penghasilan Gaji Pegawai ======");
        

        String golongan;
        int jumlah_anak;
        char istri;
        String sudah_menikah;

        System.out.print("Masukkan jenis golongan anda : ");
        golongan = input.nextLine();
        
        System.out.print("Apakah kamu sudah menikah ? (ya/tidak) : ");
        sudah_menikah = input.nextLine();
        if (sudah_menikah.equals("ya")){
            System.out.print("Masukkan jumlah anak yang anda miliki : ");
            jumlah_anak = input.nextInt();
            if (jumlah_anak >=4){
                System.out.println("Mohon maaf ,Anda hanya mendapatkan tunjangan maksimal 3 anak");
                System.exit(0);  
            }else if(jumlah_anak <=3){
                menghitungtotal objekhitung = new menghitungtotal();
                switch (golongan){
                    case "A" :
                        totalnilai = objekhitung.menghitung_gaji(3_000_000);
                        System.out.println("Total penghasilan gaji pegawai : "+totalnilai);
                        break;
                    case "B" :
                        totalnilai = objekhitung.menghitung_gaji(4_000_000);
                        System.out.println("Total penghasilan gaji pegawai : "+totalnilai);
                        break;
                    case "C" :
                        totalnilai = objekhitung.menghitung_gaji(5_000_000);
                        System.out.println("Total penghasilan gaji pegawai : "+totalnilai);
                        break;
                    case "D" :
                        totalnilai = objekhitung.menghitung_gaji(6_000_000);
                        System.out.println("Total penghasilan pegawai : "+totalnilai);
                }
            }
        }else if(sudah_menikah.equals("N")){
            menghitungtotal objekhitung = new menghitungtotal();
            switch (golongan){
                case "A" :
                    totalnilai = objekhitung.hitunggaji1(3_000_000);
                    System.out.println("Total Penghasilan Gaji Pegawai : "+totalnilai);
                    break;
                case "B" :
                    totalnilai = objekhitung.hitunggaji1(4_000_000);
                    System.out.println("Total Penghasilan Gaji Pegawai : "+totalnilai);
                    break;
                case "C" :
                    totalnilai = objekhitung.hitunggaji1(5_000_000);
                    System.out.println("Total Penghasilan Gaji Pegawai : "+totalnilai);
                    break;
                case "D" :
                    totalnilai = objekhitung.hitunggaji1(6_000_000);
                    System.out.println("Total Penghasilan Gaji Pegawai : "+totalnilai);
        }
    }
}
}
