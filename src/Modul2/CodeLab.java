package Modul2;
import java.util.LinkedList;

public class CodeLab {
    public static void main(String[] args) {
        LinkedList<String> objekHewan = new LinkedList<>();
        LinkedList<String> deleteHewan = new LinkedList<>();
//list hewan
        objekHewan.add("Sapi");
        objekHewan.add("Kelinci");
        objekHewan.add("Kambing");
        objekHewan.add("Unta");
        objekHewan.add("Domba");
//list delete
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println(objekHewan);
        System.out.println("Hewan yang akan dimusnahkan : " + deleteHewan);
        objekHewan.removeAll(deleteHewan);
        System.out.println(objekHewan);
    }


}
