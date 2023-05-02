package com.Lidia.PBO.Pertemuan3;

public class LayananKesehatan {
    private String nama;
    private String benefit;
    private double harga;

    public LayananKesehatan(String nama, String benefit, double harga) {
        this.nama = nama;
        this.benefit = benefit;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public double getBiaya() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String toString() {
        return nama + "\nBenefit : " + benefit + "\nBiaya : Rp " + harga + "\n";
    }
}
