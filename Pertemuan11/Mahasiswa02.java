package Pertemuan11;

public class Mahasiswa02 {
    String nim;
    String nama;
    String prodi;
    double ipk; 
    
    public Mahasiswa02(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %-10s %.1f\n", nama, nim, prodi, ipk);
    }
}