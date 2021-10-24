package vn.giadinh.edu.tuna07;

public class SanPham {

    String tenSp;
    double gia ;
    double giamGia;
    double thue ;

    public SanPham(){}
    
    public SanPham(String t, double g , double gg ,double  th){

        tenSp = t ;
        gia = g ;
        giamGia = gg ;
        thue = th;

    }

    void inThongTin(){
        System.out.println("Tên : "+tenSp);
        System.out.println("Giá : "+gia);
        System.out.println("Giảm giá :"+giamGia);
        System.out.println("Thuế :"+thue);
    }
    public boolean equals (SanPham other){
        boolean match = true ;

        if((tenSp.equals(other.tenSp))&& gia==other.gia){

            match = true ;

        }else match = false ;
        return match ;
    }

}
