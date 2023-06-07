package com.Lidia.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas {
    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan bilangan ke-1: ");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukkan bilangan ke-2: ");
            int bilangan2 = scanner.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println("Hasil pembagian: " + hasil);

        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid. Harus masukkan bilangan bulat.");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan : Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}
