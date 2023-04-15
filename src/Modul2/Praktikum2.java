package Modul2;

public class Praktikum2  {
// references object
    static class Node{
        int data;
        Node next;
// constructor to set the data and iniatialized
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){

        Node node = new Node(data);

        if (head == null){
            head = node; // making first node become head and tail
            tail = node;
        }else{
            tail.next = node; //
            tail = node;
        }

    }

    public void sortList(){
        Node sekarang = head;
        Node index;

        int temp;
        if (head == null){
            return;
        }else{
            while (sekarang != null){
                index = sekarang.next;
                while (index != null){
                    if (sekarang.data > index.data) {
                        temp = sekarang.data;
                        sekarang.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                sekarang = sekarang.next;
            }
        }

    }

    public void display()
    {
        // Node current will point to head
        Node sekarang = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (sekarang != null) {
            // Prints each node by incrementing pointer
            System.out.print(sekarang.data + " ");
            sekarang = sekarang.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
    Praktikum2 objekList = new Praktikum2();
    objekList.addNode(7);
    objekList.addNode(1);
    objekList.addNode(4);
    objekList.addNode(6);
    objekList.addNode(2);
    objekList.addNode(3);

    System.out.println("Objek original");
    objekList.display();

    objekList.sortList();
    System.out.println("Objek sorted");
    objekList.display();
    }
}
