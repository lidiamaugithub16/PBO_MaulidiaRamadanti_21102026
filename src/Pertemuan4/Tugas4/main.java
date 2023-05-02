package Pertemuan4.Tugas4;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        boolean pilih = true;

        while (pilih) {
            System.out.println("===== Manajemen Perpustakaan =====");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\n===== BUKU FIKSI =====\n");
                    System.out.print("Masukkan Judul: ");
                    String judulFiksi = scanner.nextLine();
                    System.out.print("Masukkan Pengarang: ");
                    String pengarangFiksi = scanner.nextLine();
                    System.out.print("Masukkan Genre: ");
                    String genreFiksi = scanner.nextLine();
                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, pengarangFiksi, genreFiksi);
                    perpustakaan.tambahBuku(bukuFiksi);
                    System.out.println("Buku Fiksi berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.print("\n===== BUKU NON-FIKSI =====\n");
                    System.out.print("Masukkan Judul: ");
                    String judulNonFiksi = scanner.nextLine();
                    System.out.print("Masukkan Pengarang: ");
                    String pengarangNonFiksi = scanner.nextLine();
                    System.out.print("Masukkan Subjek: ");
                    String subjekNonFiksi = scanner.nextLine();
                    NonFiksi bukuNonFiksi = new NonFiksi(judulNonFiksi, pengarangNonFiksi, subjekNonFiksi);
                    perpustakaan.tambahBuku(bukuNonFiksi);
                    System.out.println("Buku Non-Fiksi berhasil ditambahkan!\n");
                    break;
                case 3:
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case 4:
                    pilih = false;
                    System.out.println("Terima kasih telah menggunakan program Manajemen Perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi!\n");
                    break;
            }
        }
    }
}
