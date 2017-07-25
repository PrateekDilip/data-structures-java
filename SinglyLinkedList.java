import java.util.Scanner;
class node {
    protected int data; 
    protected node link;
    public node() {
        data = -1;
        link = null;
    }
    public node(int d, node l) {
        data = d;
        link = l;
    }
    public void setLink(node n) {
        link = n;
    }
    public void setData(int d) {
        data = d;
    }
    public node getLink() {
        return link;
    }
    public int getData() {
        return data;
    }
}
class linkedlist {
    protected node start;
    protected node end;
    public int size;
    public linkedlist() {
        start = null;
        end = null;
        size = 0;
    } 
    public boolean isEmpty() {
        return start == null;
    }
    public int getSize() {
        return size;
    }
    public void insertAtEnd(int val) {
        node temp = new node(val, null);
        size++;
        if(start == null) {
            start = temp;
            end = start;
        } else {
            end.setLink(temp);
            end = temp;
        }
    }
    public void display() {
        if (size == 0) {
            System.out.println("List is empty\n");
            return;
        }
        node ptr = start;
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
            System.out.print(ptr.getData()+ "\n");
    }
}


public class SinglyLinkedList {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        linkedlist list = new linkedlist();
        list.insertAtEnd(scan.nextInt());         
        list.insertAtEnd(scan.nextInt());         
        list.insertAtEnd(scan.nextInt());         
        list.insertAtEnd(scan.nextInt());         
        list.display();
    }
}
