package Pertemuan4.Tugas4;

public class NonFiksi extends Buku {
    protected String subjek;

    public NonFiksi(String judul, String pengarang, String subjek) {
        super(judul, pengarang);
        this.subjek = subjek;
    }
    public String getSubjek() {
        return subjek;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subjek: " + subjek);
    }
}
