package Modul2;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum {
    static int opt;
    static Scanner userInput = new Scanner(System.in);
    static ArrayList<String> namaHewan = new ArrayList<>();
    static ArrayList<Integer> temp = new ArrayList<>();
    static boolean check = false;
    public static void main(String[] args) {

        namaHewan.add("Angsa");
        namaHewan.add("Bebek");
        namaHewan.add("Cicak");
        namaHewan.add("Domba");
        namaHewan.add("Elang");
        namaHewan.add("Gajah");
        menu();

        do {
            System.out.print("Choose Step : ");
            opt = userInput.nextInt();
            if (opt == 1) {
                System.out.println("Tampilkan elemen terkini");
                System.out.println(namaHewan);
            } else if (opt == 2) {
                System.out.print("Tambah Elemen : ");
                namaHewan.add(userInput.next());
            } else if (opt == 3) {
                System.out.println("3. Cari Posisi Bebek");
                for (int i = 0; i < namaHewan.size(); i++) {
                    if (namaHewan.get(i).equals("Bebek")) {
                        temp.add(i);
                    }
                }
                System.out.println("Index bebek : " + temp);
                System.out.println("Jumlah bebek : " + temp.size());
                temp.removeAll(temp);
            } else if (opt == 4) {
                System.out.println("Hapus posisi bebek pertama");
                namaHewan.remove("Bebek");
                System.out.println(namaHewan);
            } else if (opt == 5) {
                System.out.println("Tampilkan index ke-0 dan ke-2, hapus index ke-0");
                System.out.println(namaHewan.get(0));
                System.out.println(namaHewan.get(2));
                namaHewan.remove(0);
            } else if (opt == 6) {
                System.out.println("Ubah index ke-0 dan ke-2");
                namaHewan.remove(0);
                namaHewan.add(0, "Ular");
                namaHewan.add(2, "Itik");
                System.out.println("Done");
            } else if (opt == 7) {
                System.out.println("Hapus elemen diantara index ke-1 dan ke-5");
                namaHewan.subList(1, 5).clear();
                System.out.println(namaHewan);
            } else if (opt == 8) {
                System.out.println("Tampilkan elemen pertama dan terakhir");
                System.out.println(namaHewan.get(0));
                System.out.println(namaHewan.get(namaHewan.size() - 1));
            } else if (opt == 9) {
                System.out.println("Tampilkan jumlah elemen pada ArrayList");
                System.out.println(namaHewan.size());
            } else if (opt == 10) {
                System.out.println("Carilah posisi index dari badak");
                System.out.println(namaHewan.indexOf("Badak"));
            }
        }while (opt != 10);




    }

    static public void menu() {
        System.out.println("1. Tampilkan elemen terkini");
        System.out.println("2. Tambah Elemen");
        System.out.println("3. Cari Posisi Bebek");
        System.out.println("4. Hapus posisi bebek pertama");
        System.out.println("5. Tampilkan index ke-0 dan ke-2, hapus index ke-0");
        System.out.println("6. Ubah index ke-0 dan ke-2");
        System.out.println("7. Hapus elemen diantara index ke-1 dan ke-5");
        System.out.println("8. Tampilkan elemen pertama dan terakhir");
        System.out.println("9. Tampilkan jumlah elemen pada ArrayList");
        System.out.println("10. Carilah posisi index dari badak");
    }




    }

