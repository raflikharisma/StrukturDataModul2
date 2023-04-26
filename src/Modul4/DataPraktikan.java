package Modul4;

import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {
    static HashMap<String, String> tabelSesiLogin = new HashMap<>();
    static Scanner userInput = new Scanner(System.in);
    static listMethod objectList = new listMethod();

    public static void dashBoard() {

        String tempNim;
        String tempName;
        int choice = 0;

        while (choice != 8) {

            System.out.println("1. Add data");
            System.out.println("2. Show Data");
            System.out.println("3. Show Assistant");
            System.out.println("4. Show Practician");
            System.out.println("5. Delete data");
            System.out.println("6. Edit Data");
            System.out.println("8. Exit");
            System.out.print("Input yout choice   : ");
            choice = userInput.nextInt();
            userInput.nextLine();
            if (choice == 1) {
                System.out.println();
                System.out.println("--Tambah Data Baru--");
                while (true) {
                    System.out.print("Masukkan Nim    : ");
                    tempNim = userInput.nextLine();
                    if (!objectList.checkNim(tempNim)) {
                        System.out.println("Syarat tidak terpenuhi");
                    } else {
                        break;
                    }
                }
                while (true) {
                    System.out.print("Masukkan Nama   : ");
                    tempName = userInput.nextLine();
                    if (!objectList.checkName(tempName)) {
                        System.out.println("Syarat tidak terpenuhi");
                    } else {
                        break;
                    }
                }
                objectList.tambahData(tempNim, tempName);
                System.out.println("==================================================================================");
                System.out.println("NIM Praktikan " + tempNim + " dengan asisten " + tempName + " Berhasil ditambahkan");
                System.out.println("==================================================================================");

            } else if (choice == 2) {
                objectList.showData();
                System.out.println();
            } else if (choice == 3) {
                objectList.showAssistant();
                System.out.println();
            } else if (choice == 4) {
                objectList.showPractician();
                System.out.println();
            } else if (choice == 5) {
                System.out.println();
                System.out.print("Masukkan NIM : ");
                tempNim = userInput.nextLine();
                if (!objectList.deleteData(tempNim)) {
                    System.out.println("Data tidak ditemukan ");
                } else {
                    System.out.println("NIM : " + tempNim + " Asisten : " + objectList.dataPraktikan.get(tempNim) + " Deleted");
                    objectList.dataPraktikan.remove(tempNim);
                    System.out.println();
                }

            } else if (choice == 6) {
                System.out.println();
                System.out.println("===Edit Menu==");
                System.out.print("Masukkan Nim yang ingin di edit : ");
                tempNim = userInput.nextLine();
                objectList.editData(tempNim);
            } else if (choice == 7) {
                System.out.print("Masukkan Nama Asisten : ");
                tempName = userInput.nextLine();
                objectList.searchDataByName(tempName);
            }
        }

    }

    public static void main(String[] args) {
        int secondChoice = 0;
        String tempEmail;
        String tempPassword;
        while (secondChoice != 3) {
            System.out.println("--Welcome--");
            System.out.println("1. Sign In");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Input : ");
            secondChoice = userInput.nextInt();
            if (secondChoice == 1) {
                userInput.nextLine();
                while (true) {
                    System.out.print("1. Email (umm.ac.id) : ");
                    tempEmail = userInput.nextLine();
                    if (!objectList.checkEmail(tempEmail)) {
                        System.out.println("Email tidak valid!");
                    }else{
                        break;
                    }
                }

                while(true){
                    System.out.print("Password : ");
                    tempPassword = userInput.nextLine();
                    if (!objectList.checkPassword(tempPassword)){
                        System.out.println("Password tidak valid");
                    }else {
                        break;
                    }
                }
                tabelSesiLogin.put(tempEmail, tempPassword);
                System.out.println("==Sign in Successful==");
                System.out.println();
            } else if (secondChoice == 2){
                userInput.nextLine();
                System.out.println("-- Login --");
                System.out.print("1. Email : ");
                tempEmail = userInput.nextLine();
                System.out.print("2. Password : ");
                tempPassword = userInput.nextLine();
                if (tabelSesiLogin.containsKey(tempEmail) && tabelSesiLogin.get(tempEmail).equals(tempPassword)){
                    System.out.println("== WELCOME==");
                    dashBoard();
                }
            }
        }


    }

}

