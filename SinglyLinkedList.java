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
}


public class SinglyLinkedList {
    public static void main (String args[]) {
        
    }
}
