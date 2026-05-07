package Pertemuan11;
import java.util.Scanner;
public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc02.nextInt();
        sc02.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc02.nextLine();
            System.out.print("Nama  : ");
            String nama = sc02.nextLine();
            System.out.print("Prodi : ");
            String prodi = sc02.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc02.nextDouble();
            sc02.nextLine();
            

            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nData yang telah dimasukkan:");
        sll.print();

        sc02.close();
    }
}
