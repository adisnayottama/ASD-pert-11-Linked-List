package Pertemuan11;

public class Mhs02 {
    String nim, nama;
    Mhs02 next;

    public Mhs02(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}