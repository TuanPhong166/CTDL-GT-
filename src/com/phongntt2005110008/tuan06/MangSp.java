package com.phongntt2005110008.tuan06;

public class MangSp {

    public String tenSp ;
    public Double giaSp ;
    public Double giamGia;

    MangSp(){}

    MangSp(String ten , double gia , double giam ){
        tenSp = ten ;
        giaSp = gia ;
        giamGia = giam ;
    }

    void inThongTin(){
        System.out.println("Tên sản phẩm : "+tenSp);
        System.out.println("Giá sản phẩm : "+giaSp);
        System.out.println("Giảm giá : "+giamGia);
    }
}
