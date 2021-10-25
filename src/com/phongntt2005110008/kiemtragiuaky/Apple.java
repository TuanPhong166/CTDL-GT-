package com.phongntt2005110008.kiemtragiuaky;


public class Apple {
    int maTao ;
    double khoiLuong ;
    String color ;
  

    public Apple (){} ;

    public Apple(int ma){
        maTao = ma ;
    }

    public Apple(int ma , double kL){
        maTao = ma ;
        khoiLuong = kL;
    }

    public Apple (int ma , double kL , String c){
        maTao = ma ;
        khoiLuong = kL ;
        color = c ;
    }
    
    void inThongTin(){
        System.out.println("Mã sản phẩm Táo : "+maTao);
        System.out.println("Khối Lượng sản phẩm Táo : "+khoiLuong);
        System.out.println("Màu sắc sản phẩm táo : "+color);
    }
    

    
}
