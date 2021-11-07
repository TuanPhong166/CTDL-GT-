package com.phongntt2005110008.tuan09;

public class Node {
    Double weight  ;
    String color  ;
    int number ;
    Node next ;

    Node(){}

    Node(int n){
        number = n ;
    }

    Node(int n , Double w ){
        number = n ;
        weight  = w ;
    }
    
    Node(int n , Double w , String c){
        number = n ;
        weight = w ;
        color = c ;
    }
    
    void inThongTin(){
        System.out.println("Mã sản phẩm táo  :"+number);
        System.out.println("Cân nặng : "+weight);
        System.out.println("Màu sản phẩm táo : "+color);
        System.out.println();
    }

}