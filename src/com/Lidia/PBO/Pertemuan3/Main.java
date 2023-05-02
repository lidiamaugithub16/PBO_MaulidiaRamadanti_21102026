package com.Lidia.PBO.Pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan class
        sepedamotor honda = new sepedamotor("Honda", "Vario 160", 35000000);
        sepedamotor yamaha = new sepedamotor("Yamaha", "N Max", 40000000);
        sepedamotor vespa = new sepedamotor("Vespa", "Vespa Matic", 60000000);

        /*
        //Mengisi nilai atribut objek Honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 35000000;

        //Mengisi nilai atribut objek Yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "N Max";
        yamaha.harga = 40000000;

        //Mengisi nilai atribut objek Vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Matic";
        vespa.harga = 60000000;


         */
        //untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        // Uji coba getter and setter
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sesudah) : " + honda.getTipe());
    }
}
