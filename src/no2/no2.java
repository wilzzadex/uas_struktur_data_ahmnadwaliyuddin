package no2;

import Model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no2 {
    public static void getNo2() {
        Scanner inputanJmlMahasiswa = new Scanner(System.in);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        System.out.println("Masukkan Jumlah Mahasiswa yang akan di input: ");
        int jmlMahasiswa = inputanJmlMahasiswa.nextInt();
        System.out.println("\n");

        Scanner inputanNamaMahasiswa = new Scanner(System.in);
        Scanner inputanNimMahasiswa = new Scanner(System.in);
        Scanner inputanKelasMahasiswa = new Scanner(System.in);

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            String namaMahasiswa = inputanNamaMahasiswa.nextLine();
            System.out.println("Masukkan NIM Mahasiswa ke-" + (i + 1) + ": ");
            String nimMahasiswa = inputanNimMahasiswa.nextLine();
            System.out.println("Masukkan Kelas Mahasiswa ke-" + (i + 1) + ": ");
            String kelasMahasiswa = inputanKelasMahasiswa.nextLine();
            System.out.println("\n");

            Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, kelasMahasiswa);
            mahasiswaList.add(mahasiswa);
        }

        System.out.println("Data Mahasiswa yang telah di input: ");
        for (int i = 0; i < mahasiswaList.size(); i++) {
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + ": " + mahasiswaList.get(i).getNama());
            System.out.println("NIM Mahasiswa ke-" + (i + 1) + ": " + mahasiswaList.get(i).getNim());
            System.out.println("Kelas Mahasiswa ke-" + (i + 1) + ": " + mahasiswaList.get(i).getKelas());
            System.out.println("\n");
        }

        System.out.println("Masukkan Nama Mahasiswa yang akan di cari: ");
        String namaMahasiswaDicari = inputanNamaMahasiswa.nextLine();
        System.out.println("\n");

        String[] namaMahasiswaArray = new String[mahasiswaList.size()];
        for (int i = 0; i < mahasiswaList.size(); i++) {
            namaMahasiswaArray[i] = mahasiswaList.get(i).getNama();
        }

        Scanner inputanMetode = new Scanner(System.in);
        System.out.println("Pilih search yang akan digunakan");
        System.out.println("1. Binary Search");
        System.out.println("2. Linear Search");

        System.out.println("Masukkan pilihan: ");
        int pilihan = inputanMetode.nextInt();
        System.out.println("\n");

        Scanner inputanUrutan = new Scanner(System.in);
        System.out.println("Pilih metode yang akan digunakan");
        System.out.println("1. urutan ganjil iterative");
        System.out.println("2. urutan genap recursive function");

        System.out.println("Masukkan pilihan: ");
        int pilihanUrutan = inputanUrutan.nextInt();
        System.out.println("\n");

        if (pilihan == 1) {
            if (pilihanUrutan == 1) {
                int result = binarySearchOddOrder(namaMahasiswaArray, namaMahasiswaDicari);
                if (result == -1)
                    System.out.println("Nama Mahasiswa yang dicari tidak ditemukan");
                else
                    System.out.println("Nama Mahasiswa yang dicari ditemukan pada index ke-" + result);
                    System.out.println("Nama Mahasiswa yang dicari: " + namaMahasiswaArray[result] + " dengan NIM: " + mahasiswaList.get(result).getNim() + " dan kelas: " + mahasiswaList.get(result).getKelas()) ;

            } else if (pilihanUrutan == 2) {
                int result = binarySearchEvenOrder(namaMahasiswaArray, namaMahasiswaDicari, 0, namaMahasiswaArray.length - 1);
                if (result == -1)
                    System.out.println("Nama Mahasiswa yang dicari tidak ditemukan");
                else
                    System.out.println("Nama Mahasiswa yang dicari ditemukan pada index ke-" + result);
                    System.out.println("Nama Mahasiswa yang dicari: " + namaMahasiswaArray[result] + " dengan NIM: " + mahasiswaList.get(result).getNim() + " dan kelas: " + mahasiswaList.get(result).getKelas()) ;

            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        } else if (pilihan == 2) {
            if (pilihanUrutan == 1) {
                int result = linearSearchOddOrder(namaMahasiswaArray, namaMahasiswaDicari);
                if (result == -1)
                    System.out.println("Nama Mahasiswa yang dicari tidak ditemukan");
                else
                    System.out.println("Nama Mahasiswa yang dicari ditemukan pada index ke-" + result);
                System.out.println("Nama Mahasiswa yang dicari: " + namaMahasiswaArray[result] + " dengan NIM: " + mahasiswaList.get(result).getNim() + " dan kelas: " + mahasiswaList.get(result).getKelas()) ;
            } else if (pilihanUrutan == 2) {
                int result = linearSearchEvenOrder(namaMahasiswaArray, namaMahasiswaDicari, namaMahasiswaArray.length - 1);
                if (result == -1)
                    System.out.println("Nama Mahasiswa yang dicari tidak ditemukan");
                else
                    System.out.println("Nama Mahasiswa yang dicari ditemukan pada index ke-" + result);
                    System.out.println("Nama Mahasiswa yang dicari: " + namaMahasiswaArray[result] + " dengan NIM: " + mahasiswaList.get(result).getNim() + " dan kelas: " + mahasiswaList.get(result).getKelas()) ;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        } else {
            System.out.println("Pilihan tidak tersedia");
        }



    }

    public static int binarySearchOddOrder(String[] arr, String x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int res = x.compareTo(arr[mid]);
            if (res == 0)
                return mid;
            if (res > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }


    public static int binarySearchEvenOrder(String[] arr, String x, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            int res = x.compareTo(arr[mid]);
            if (res == 0)
                return mid;
            if (res > 0)
                return binarySearchEvenOrder(arr, x, mid + 1, right);
            else
                return binarySearchEvenOrder(arr, x, left, mid - 1);
        }

        return -1;
    }

    public static int linearSearchOddOrder(String[] arr, String x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }

    public static int linearSearchEvenOrder(String[] arr, String x, int n) {
        if (n < 0)
            return -1;
        if (arr[n].equals(x))
            return n;
        return linearSearchEvenOrder(arr, x, n - 1);
    }



}
