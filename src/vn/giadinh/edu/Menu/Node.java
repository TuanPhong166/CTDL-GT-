package vn.giadinh.edu.Menu;

public class Node {
    

    Book book;
    Node next;

    public Node() {
        book = null;
        next = null;
    }

    public Node(Book newBook){
        book = newBook;
        next = null;
    }

    public Node(Book newBook, Node node){
        book = newBook;
        next = node;
    }
    
}
