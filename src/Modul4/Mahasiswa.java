package Modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa( String nameMhs, String kelasMhs,String matkulMhs, int nimMhs){
      nama = nameMhs;
      kelas = kelasMhs;
      matkulPraktikum =matkulMhs;
      nim = nimMhs;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Rafli", "4i", "Struktur Data", 11402));
        mhs.put("2", new Mahasiswa("Alviya", "4B", "Basis Data", 11400));
        mhs.put("3", new Mahasiswa("Bon bon", "4I", "AIK", 11395));

        System.out.println("Masukkan ID: ");
        input = userInput.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", Mata kuliah Praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}
