package com.phongntt2005110008.kiemtragiuaky;

public class Node {
     // Nội dung
     int maTao ;
     double khoiLuong ;
     String color ;
     // Liên kết đén nút tiếp theo
     Node next ; // Biến tham chiếu kiểu Node
 
     public Node(){} // hàm tạo rỗng
     
     public Node(int d){  // hàm tạo 1 tham chiếu 
           maTao = d ;
     }
 
     public Node(int d , double kL){ // hàm tạo 2 tham chiếu 
         maTao = d ;
         khoiLuong = kL ;
     }
     public Node(int d , double kL , String c , Node n){
         maTao = d ;
         khoiLuong = kL ;
         color = c ;
         next = n;
     }
    
}
