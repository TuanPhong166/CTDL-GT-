package vn.giadinh.edu.Menu;



public class Book {

    int id  ;
    Double donGia ;
    int soLuong ;
    String color ;

    public Book (){}

    public Book(int _id){
        id = _id ;
    }

    public Book(int _id , double _donGia){
        id = _id ;
        donGia = _donGia ;
    }

    public Book(int _id , double _donGia , int _soLuong){
        id = _id ;
        donGia = _donGia ;
        soLuong = _soLuong ;
    }

    
    public Book(int _id , double _donGia , int _soLuong, String _color ){
        id = _id ;
        donGia = _donGia ;
        soLuong = _soLuong ;
        color = _color ;
    }


    void inThongTin(){
        System.out.println("Mã sản phẩm sách : "+id);
        System.out.println("Đơn giá sản phẩm sách : "+donGia);
        System.out.println("Số lượng sản phẩm sách : "+soLuong);
        System.out.println("Màu sản phẩm sách : "+color );
    }

    
}
