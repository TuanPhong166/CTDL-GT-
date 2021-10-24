package vn.giadinh.edu.tuna07;

public class DanhSachSanPhamTestDrive {

    public static void main(String[] args) {
        
        DanhSachSanPham danhSachSanPham = new DanhSachSanPham();

        //danhSachSanPham.add(SanPham);

        // danhSachSanPham.add(1 , SanPham);

        // danhSachSanPham.inDanhSachSp();

        String str1 = " Mr Teo ";
        String str2 = " Mr Ty";

        if (str1.equals(str2)){
            System.out.println("không giống nhau");
        }

        SanPham sanPham = new SanPham() ;

        SanPham sanPham2 = new SanPham();

        if(sanPham == sanPham2){
           System.out.println("Bằng nhau ...");
        }

        if(sanPham.equals(sanPham2)){
            //code 
        }
    }

    
}
