package Modul3;

import java.util.Scanner;

public class AntrianHaji {
    static Scanner input = new Scanner(System.in);
    static AntrianHaji antrian_haji = new AntrianHaji(10);
    private final String[] dataHaji;
    private int front;
    private int rear;
    private final int size;

    public AntrianHaji(int size) {
        this.dataHaji = new String[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean is_empty() {
        return front == -1;
    }

    public boolean is_full() {
        return rear == size - 1;
    }

    public void tambah_antrian(String nama, String kota_kelahiran) {
        if (is_full()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (is_empty()) {
                front = 0;
            }
            rear++;
            dataHaji[rear] = nama + ", " + kota_kelahiran;
            System.out.println(nama + " Berhasil ditambahkan ke antrian, tunggun yaa hehe");
        }
    }

    public void keluar_antrian() {
        if (is_empty()) {
            System.out.println("Antrian Kosong");
        } else {
            String item = dataHaji[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(item + " dikeluarkan dari antrian");
        }
    }

    public void tampilkan_antrian() {
        if (is_empty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Daftar Antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + dataHaji[i] + " /n");
            }
        }
    }

    public void hapus_antrian(String nama) {
        if (is_empty()) {
            System.out.println("Antrian Kosong");
        } else {
            boolean found = false;
            for (int i = front; i <= rear; i++) {
                if (dataHaji[i].startsWith(nama)) {
                    System.out.println(dataHaji[i] + " berhasil dihapus dari antrian");
                    // menggeser data ke kiri untuk menimpa data yang dihapus
                    for (int j = i; j < rear; j++) {
                        dataHaji[j] = dataHaji[j + 1];
                    }
                    rear--;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(nama + " tidak ditemukan di antrian");
            }
        }
    }
    public void cari_antrian(String nama) {
        if (is_empty()) {
            System.out.println("Antrian Kosong");
        } else {
            boolean found = false;
            for (int i = front; i <= rear; i++) {
                if (dataHaji[i].startsWith(nama)) {
                    System.out.println(dataHaji[i]);
                found = true;
                }
            }
            if (!found) {
                System.out.println(nama + " tidak ditemukan di antrian");
            }
        }
    }

    public void menuPemerintah() {
        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("\n1. Berangkatkan antrian ");
            System.out.println("2. Batalkan haji");
            System.out.println("3. Tampilkan antrian");
            System.out.println("4. Cari data pendaftar");
            System.out.println("5. Exit");

            System.out.print("\nInput : ");
            pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1) {
                antrian_haji.keluar_antrian();
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama : ");
                String inputNama = input.nextLine();
                antrian_haji.hapus_antrian(inputNama);
            } else if (pilihan == 3) {
                antrian_haji.tampilkan_antrian();
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama yang dicari :");
                String cariNama = input.nextLine();
                antrian_haji.cari_antrian(cariNama);
            }
        }
    }
    public void menuPendaftar() {
        System.out.println("1. Daftar haji");
        System.out.println("2. Tampilkan jumlah antrian");
        System.out.print("Input : ");
        int pendChoice = input.nextInt();
        input.nextLine();
        if (pendChoice == 1){
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kota Kelahiran: ");
            String kota_kelahiran = input.nextLine();
            antrian_haji.tambah_antrian(nama, kota_kelahiran);
        }else {
            antrian_haji.tampilkan_antrian();
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Login sebagai : ");
            System.out.println("1. Pemerintah");
            System.out.println("2. Pendaftar");
            System.out.print("Your input : ");
            int yourChoice = input.nextInt();
            input.nextLine();
            if (yourChoice == 1) {
                System.out.println("\nLogin sebagai pemerintah");
                antrian_haji.menuPemerintah();
            } else if (yourChoice == 2) {
                System.out.println("\nLogin sebagai pendaftar");
                antrian_haji.menuPendaftar();
            }

        } while (true);
    }
}

