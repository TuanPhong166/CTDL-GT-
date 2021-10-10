package com.phongntt2005110008.tuan05;


public class SanPham {
    
   // tạo đối tượng tham chiếu sản pham
     String tenSp ;
    double donGia ;
     double giamGia ;
     double thueNhapKhau ;
   // hàm tạo
    public SanPham(){}
   
    public SanPham(String ten , double gia , double giam , double thue){
         
        tenSp = ten ;
        donGia = gia ;
        giamGia = giam ;
        thueNhapKhau = thue ;
    }
    
   
}
