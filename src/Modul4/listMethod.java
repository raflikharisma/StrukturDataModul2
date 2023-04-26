package Modul4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class listMethod {
    static Scanner userInput2nd = new Scanner(System.in);
    HashMap<String, String> dataPraktikan = new HashMap<>();

    public boolean checkEmail(String tempEmail) {
        return  tempEmail.endsWith("@webmail.umm.ac.id");
    }

    public boolean checkPassword(String tempPassword){
        return tempPassword.length() >= 8;
    }
    public boolean checkNim(String nimPraktikan) {
        return nimPraktikan.startsWith("IF") && nimPraktikan.substring(3).matches("^[0-9]+$") && nimPraktikan.length() == 17;
    }

    public boolean checkName(String namaPraktikan) {
        return namaPraktikan.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    }

    public void tambahData(String nimPraktikan, String namaPraktikan) {
        dataPraktikan.put(nimPraktikan, namaPraktikan);
    }

    public void showData() {
        System.out.println();
        System.out.println("--List Data--");
        System.out.println("Jumlah data : " + dataPraktikan.size());
        for (String i : dataPraktikan.keySet()) {
            System.out.println("Nim Praktikan : " + i + " Nama Asisten : " + dataPraktikan.get(i));
        }
    }

    public void showAssistant() {
        System.out.println();
        if (dataPraktikan.isEmpty()) {
            System.out.println("Data kosong");
        } else {
            int j = 1;
            System.out.println("Nama-nama Asisten : ");
            for (String i : dataPraktikan.values()) {
                System.out.println(j + ", " + i);
                j++;
            }
        }

    }

    public void showPractician() {
        System.out.println();
        if (dataPraktikan.isEmpty()) {
            System.out.println("Data kosong");
        }
        System.out.println("NIM Praktikan : ");
        int j = 1;
        for (String i : dataPraktikan.keySet()) {
            System.out.println(j + ". " + i);
            j++;
        }

    }

    public boolean deleteData(String nimPraktikan) {
        return dataPraktikan.containsKey(nimPraktikan);
    }

    public void editData(String nimPraktikan) {
        if (dataPraktikan.containsKey(nimPraktikan)) {
            System.out.println("NIM : " + nimPraktikan + " Asisten : " + dataPraktikan.get(nimPraktikan));
            System.out.print("Masukkan nama asisten yang baru : ");
            String newName = userInput2nd.nextLine();
            dataPraktikan.put(nimPraktikan, newName);
            System.out.println("Data updated!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public void searchDataByName(String namaAsisten) {
        System.out.println("Berikut List NIM Praktikan : ");
        int num = 1;
        for (Map.Entry<String, String> search : dataPraktikan.entrySet()) {
            String tempKey = search.getKey();
            String tempValue = search.getValue();

            if (tempValue.equals(namaAsisten)) {
                System.out.println(num + ". " + tempKey);
                num++;
            }
        }
    }


}
