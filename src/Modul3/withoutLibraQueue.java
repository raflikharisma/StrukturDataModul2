package Modul3;

class Link{
    public int dData;
    public Link next;

    public Link(int num){
        dData = num;
    }

    public void displayLink(){
        System.out.println(dData + " ");
    }

}

class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean empty() {
        return first == null;
    }

    public void isertLast(int theNum) {
        Link newLink = new Link(theNum);

        if (empty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }

        last = newLink;
    }

    public int deletedFirst() {
        int temp = (int) first.dData;
        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;

    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

}

class LinkQueue{

    public FirstLastList theList;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    public boolean isEmpty(){
      return  theList.empty();

    }

    public void enqueue(int j){
        theList.isertLast(j);
    }

    public long dequeue(){
        return theList.deletedFirst();
    }

    public void displayQueue(){
        System.out.println("Queue :  ");
        theList.displayList();
    }

}
    public class withoutLibraQueue {
        public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();


        queue.enqueue(10);
        queue.enqueue(40);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        }
    }

