package Pertemuan11;

public class QueueLinkedList02 {

    Mhs02 front, rear;
    int size;

    public QueueLinkedList02() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(String nim, String nama) {
        // 2. Instansiasi objek menggunakan Mhs02
        Mhs02 baru = new Mhs02(nim, nama); 
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru; 
            rear = baru;
        }
        size++;
        System.out.println(nama + " telah masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil antrian: " + front.nama + " (" + front.nim + ")");
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("\n--- Status Antrian ---");
            System.out.print("Paling Depan: "); front.tampilInformasi();
            System.out.print("Paling Belakang: "); rear.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrean: " + size);
    }
    
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
    
        Mhs02 tmp = front; 
        System.out.println("\nDAFTAR SELURUH ANTRIAN:");
        while (tmp != null) {
            tmp.tampilInformasi();
            tmp = tmp.next;
        }
    }
}