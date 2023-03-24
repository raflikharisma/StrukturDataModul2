package Modul2;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        int opt;
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> namaHewan = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        namaHewan.add("Angsa");
        namaHewan.add("Bebek");
        namaHewan.add("Cicak");
        namaHewan.add("Domba");
        namaHewan.add("Elang");
        namaHewan.add("Gajah");

        System.out.println("1. Tampilkan elemen terkini");
        System.out.println("2. Tambah Elemen");
        System.out.println("3. Cari Posisi Bebek");
        System.out.println("4. Hapus posisi bebek");
        do {
            System.out.print("Choose Step : ");
            opt = userInput.nextInt();
            if (opt == 1) {
                System.out.println(namaHewan);
            } else if (opt == 2) {
                namaHewan.add(userInput.next());
            } else if (opt == 3) {
                for (int i = 0; i < namaHewan.size(); i++) {
                    if (namaHewan.get(i).equals("Bebek")) {
                        temp.add(i);
                    }
                }
                System.out.println("Index bebek : " + temp);
            }else if (opt == 4){
                namaHewan.remove("Bebek");
                System.out.println(namaHewan);
            }else if (opt == 5){
                System.out.println(namaHewan.get(0));
                System.out.println(namaHewan.get(2));
                namaHewan.remove(0);
            } else if (opt == 6) {
                namaHewan.remove(0);
                namaHewan.add(0, "Ular");
                namaHewan.add(2, "Itik");
            }else if (opt == 7){
                namaHewan.subList(1, 5).clear();
                System.out.println(namaHewan);
            }else if (opt == 8){
                System.out.println(namaHewan.get(0));
                System.out.println(namaHewan.get(namaHewan.size() - 1));
            }else if (opt == 9){
                System.out.println(namaHewan.size());
            }else if(opt == 10){
                System.out.println(namaHewan.indexOf("Badak"));
            }
        } while (opt != 10);

    }


}
