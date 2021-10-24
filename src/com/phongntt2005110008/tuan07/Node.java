package com.phongntt2005110008.tuan07;

public class Node {
    // Nội dung
    int data ;
    // Liên kết đén nút tiếp theo
    Node next ; // Biến tham chiếu kiểu Node

    public Node(){} // hàm tạo rỗng
    
    public Node(int d){  // hàm tạo 1 tham chiếu 
          data = d ;
    }

    public Node(int d , Node n){ // hàm tạo 2 tham chiếu 
        data = d ;
        next =  n ;
    }
}
