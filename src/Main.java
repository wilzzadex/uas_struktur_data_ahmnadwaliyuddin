import java.util.Scanner;
import  static no1.no1.getNo1;
import  static no2.no2.getNo2;
import static no3.no3.getNo3;

public class Main {
    public static void main(String[] args) throws Exception {
        String header = "UJIAN AKHIR SEMESTER\n" + "Nama\t\t: Ahmad Waliyuddin\n" +
                "NIM\t\t: 22552011106\n" +
                "Kelas\t\t: Tif RM 22 A - OFFLINE\n" +
                "Mata Kuliah\t: Struktur Data\n" +
                "Dosen\t\t: Muhammad Reksa Ariansyah S.Kom M.Kom.\n" +

                "============================================\n";
        String textSoal = "1.\tBuat contoh implementasi stack dan queue pada coding program (lakukan show, insert, deletion pada stack dan queue) ?\n" +
                "2.\tBuat search program untuk array of string menggunakan (urutan ganjil iterative, urutan genap recursive function) untuk melakukan search pada array of string menggunakan linier search dan binary search\n" +
                "3.\tBuat contoh coding binary tree lakukan insert, traversalOrder, max, min dan menghitung element size dari binary tree?\n";

        System.out.println(header);
        System.out.println(textSoal);
        Scanner pilihanSoal = new Scanner(System.in);
        System.out.println("Masukkan Nomor Soal yang akan dijalankan: ");
        int nomorSoal = pilihanSoal.nextInt();
        switch (nomorSoal) {
            case 1:
                getNo1();
                rerunSoal(nomorSoal);
                main(args);
                break;
            case 2:
                getNo2();
                rerunSoal(nomorSoal);
                main(args);
                break;
            case 3:
                getNo3();
                rerunSoal(nomorSoal);
                main(args);
                break;
            default:
                System.out.println("Nomor Soal yang anda masukkan tidak ada");
        }

    }

    public  static void rerunSoal(int noSoal) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda ingin menjalankan soal lagi? (Y/N)");
        String pilihan = input.nextLine();
        if(pilihan.equals("Y") || pilihan.equals("y")) {
            switch (noSoal){
                case 1:
                    getNo1();
                    rerunSoal(noSoal);
                    break;
                case 2:
                    getNo2();
                    rerunSoal(noSoal);
                    break;
                case 3:
                    getNo3();
                    rerunSoal(noSoal);
                    break;
                default:
                    System.out.println("No Soal Tidak Ada");
                    main(null);
            }
        }
    }
}