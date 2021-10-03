package vn.giadinh.edu.tuan04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive {

    public static void main(String[] args) {
        
        // tạo danh sách sinh viên
        SinhVien[] mangSinhVien = new SinhVien[1] ;


        // nhập danh sách sinh viên từ bàn phím
        Scanner input =  new Scanner(System.in) ;
        System.out.println("Nhập danh sách Sinh Viên   ");
        // sủ dụng vòng lập để nhập
        for (int i = 0 ; i < mangSinhVien.length; i++){
            System.out.println("Nhập sinh viên thứ : "+(i+1));
            System.out.print("Tên sinh viên : ");
            String name = input.nextLine();
            System.out.print("Mã số sinh viên : ");
            String mssv = input.nextLine();
            System.out.print("Tuổi : ");
            int tuoi = input.nextInt();
            input.nextLine(); // nhận vào phím Enter
            System.out.print("Quê quán : ");
            String queQuan = input.nextLine();
            mangSinhVien[i] = new SinhVien(mssv, name, tuoi, queQuan);

        }

        // sử dụng for-each để duyệt mảng
        System.out.println(">>>>>In Danh Sách<<<<<");
        for (SinhVien sinhVien : mangSinhVien) {

            sinhVien.inThongTin();
            
        }

        List list = Arrays.asList(mangSinhVien);
     }
    
}
