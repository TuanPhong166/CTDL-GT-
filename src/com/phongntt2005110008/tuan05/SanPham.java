package com.phongntt2005110008.tuan05;


public class SanPham {
    
   // tạo đối tượng tham chiếu sản pham
     String tenSp ;
    public static double donGia ;
     double giamGia ;
     double thueNhapKhau ;
   // hàm tạo
    public SanPham(){}

    public SanPham(String ten , double gia , double giam ){
      tenSp = ten ;
        donGia = gia ;
        giamGia = giam ;

    }
   
    public SanPham(String ten , double gia , double giam , double thue){
         
        tenSp = ten ;
        donGia = gia ;
        giamGia = giam ;
        thueNhapKhau = thue ;
    }
    void inThongTin(){
      System.out.println("Tên sản phẩm : "+tenSp);
      System.out.println("Đơn giá : "+donGia);
      System.out.println("Giảm giá : "+giamGia);
      thueNhapKhau=(donGia-giamGia)*0.1;
      System.out.println("Thuế nhập khẩu : "+thueNhapKhau);
    }
    
   
}
