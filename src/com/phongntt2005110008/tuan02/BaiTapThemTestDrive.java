package com.phongntt2005110008.tuan02;

public class BaiTapThemTestDrive {

    public static void main(String[] args) {

        
        
        BaiTapThem sach ; // khai báo biến tên là sach tham chiếu đối tượng kiểu Sach
        sach = new BaiTapThem(); // Tạo đối tượng sach trong vùng nhớ Heap 
        // hóa đơn sách
        System.out.println("Hóa Đơn Bán Sách");
        sach.gia = 22000 ;
        sach.nhaXuatBan = "Nhà Xuất Bản Kim Đồng" ;
        sach.namXuatBan = 1998;
        sach.giaBan = 23000 ;
        sach.soLuong = 12 ;
        sach.loai = 1 ;
        sach.inHoaDonSach();
        System.out.println("////////////////////////////////////////////////");
        
        // thông tin nhân viên 
            
        System.out.println("Thông Tin Nhân Viên ");
        BaiTapThem nhanVien ;
        nhanVien = new BaiTapThem();
        nhanVien.tenNhanVien = "Nguyễn Trí Tuấn Phong" ;
        nhanVien.luong = "23000000" ;
        nhanVien.diaChi = "Tân Trụ Long An ";
        nhanVien.boPhanLamViec = "Bảo vệ" ;
        nhanVien.ngaySinh = "16 06 2002" ;
        nhanVien.inThongTinNhanVien();
        System.out.println("////////////////////////////////////////////////");

        // Thông tin về Xe 

        System.out.println("Thông Tin về Xe");
        BaiTapThem xe ;
        xe = new BaiTapThem();
        xe.tenChuXe = "Nguyễn Trí Tuấn Phong " ;
        xe.nhanHieu = "HonDa";
        xe.mauSon = "Trắng";
        xe.diaChi ="Long An" ;
        xe.dungTich = 103 ;
        xe.inThongTinXe();
        System.out.println("////////////////////////////////////////////////");

        // thông tin ngân hàng
        System.out.println("Thông Tin Ngân Hàng");
        BaiTapThem nganHang ;
        nganHang = new BaiTapThem();
        nganHang.soTaiKhoan = "2005110008" ;
        nganHang.tenChuTaiKhoan = "Nguyễn Trí Tuấn Phong ";
        nganHang.soDu = "50.000 VND";
        nganHang.inNganHang();
        System.out.println("////////////////////////////////////////////////");
    }
    
    
}
