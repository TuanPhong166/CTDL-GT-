package vn.giadinh.edu.Menu;

public class Node {
    

    Book book ;

    Node next ;
     
    public Node(){}

    public Node(Book _book){
        book = _book ;
        next  = null ;
    }

    public Node(Book _book , Node _node){
        book = _book ;
        next = _node ;
    }
}
