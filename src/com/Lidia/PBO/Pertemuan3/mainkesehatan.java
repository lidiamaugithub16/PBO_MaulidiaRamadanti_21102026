package com.Lidia.PBO.Pertemuan3;

import java.util.Scanner;
import java.util.ArrayList;
public class mainkesehatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        ArrayList<LayananKesehatan> paketList = new ArrayList<LayananKesehatan>();
    // Membuat tiga paket layananKesehatan
        LayananKesehatan basic = new LayananKesehatan("Paket Basic", "Konsultasi dokter 1x, obat 1 minggu", 50000);
        LayananKesehatan silver = new LayananKesehatan("Paket Silver", "Konsultasi dokter 3x, obat 1 bulan", 150000);
        LayananKesehatan gold = new LayananKesehatan("Paket Gold", "Konsultasi dokter 5x, obat 2 bulan, check-up", 300000);

        // menambahkan paket layanan ke dalam list
        paketList.add(basic);
        paketList.add(silver);
        paketList.add(gold);
        // menampilkan paket layanan yang tersedia
        System.out.println("DAFTAR PAKET LAYANAN KESEHATAN\n");
        for (LayananKesehatan paket : paketList) {
            System.out.println(paket.toString());
        }
        // meminta input dari user untuk memilih paket layanan
        System.out.print("\nMasukkan nomor paket yang ingin dibeli (pisahkan dengan spasi jika lebih dari satu): ");
        String[] inputPaket = input.nextLine().split(" ");
        ArrayList<LayananKesehatan> selectedPaketList = new
                ArrayList<LayananKesehatan>();
        for (String nomor : inputPaket) {

            selectedPaketList.add(paketList.get(Integer.parseInt(nomor) - 1));
        }
        int totalBiaya = 0;
        for (LayananKesehatan paket : selectedPaketList) {
            totalBiaya += paket.getBiaya();
        }
        System.out.println("Anda telah memilih paket layanan : ");
        for (LayananKesehatan paket : selectedPaketList) {
            System.out.println(paket.toString());
        }
        System.out.println("Total Biaya : Rp " + totalBiaya);
    }
}

