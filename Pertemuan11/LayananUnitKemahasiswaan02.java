package Pertemuan11;

import java.util.Scanner;

public class LayananUnitKemahasiswaan02 {
    public static void menu() {
        System.out.println("\n--- MENU LAYANAN MAHASISWA ---");
        System.out.println("1. Tambah Antrean (Enqueue)");
        System.out.println("2. Panggil Antrean (Dequeue)");
        System.out.println("3. Lihat Antrean Terdepan & Terakhir (Peek)");
        System.out.println("4. Lihat Daftar Semua Antrean");
        System.out.println("5. Cek Jumlah Antrean");
        System.out.println("6. Kosongkan Antrean");
        System.out.println("7. Keluar");
        System.out.print("Pilih menu (1-7): ");
    }

    public static void main(String[] args) {
        QueueLinkedList02 antrean = new QueueLinkedList02();
        Scanner sc02 = new Scanner(System.in);
        int pilih;

        do {
            menu();
            pilih = sc02.nextInt();
            sc02.nextLine(); // membersihkan buffer

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc02.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc02.nextLine();
                    antrean.enqueue(nim, nama);
                    break;
                case 2:
                    antrean.dequeue();
                    break;
                case 3:
                    antrean.peek();
                    break;
                case 4:
                    antrean.printAll();
                    break;
                case 5:
                    antrean.displaySize();
                    break;
                case 6:
                    antrean.clear();
                    break;
                case 7:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 7);

        sc02.close();
    }
}