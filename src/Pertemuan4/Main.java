package Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 198067857;
        manajerkami.nama = "Hasan Sadikin";

        pegawaikami.nip = 198067857;
        pegawaikami.nama = "Asep Hutama";

        manajerkami.showInfo();
        manajerkami.extraInfo();
        manajerkami.bonus(1200000);
        manajerkami.bonus();

        pegawaikami.showInfo();
    }
}
