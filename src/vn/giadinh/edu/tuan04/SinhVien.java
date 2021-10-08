package vn.giadinh.edu.tuan04;

public class SinhVien {
    
    public String mssv;
    public String hoTen ;
    public int tuoi ;
    public String queQuan ;

    public SinhVien(){}

    public SinhVien (String m , String h , int t , String q){

        mssv = m ;
        hoTen = h ;
        tuoi = t ;
        queQuan = q ;

    }
    void inThongTin(){
        System.out.println("Mã số sinh viên : "+mssv);
        System.out.println("Họ và tên : "+hoTen);
        System.out.println("Tuổi : "+tuoi);
        System.out.println("Quê quán : "+queQuan);
    }
    
}
