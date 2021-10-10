package com.phongntt2005110008.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSV {

    // bài làm chưa xong 

    ArrayList list = new ArrayList<>();

    private String hoTen ;
    private Double diemTB ;

    public void menu(){
        System.out.println("1>> Nhập danh sách sinh viên.");
        System.out.println("2>> Xuất danh sách sinh viên đã nhập.");
        System.out.println("3>> Xuất danh sách sinh viên theo khoảng điểm.");
        System.out.println("4>> Tìm sinh viên theo họ tên.");
        System.out.println("5>> Tìm và sửa sinh viên theo họ tên.");
        System.out.println("6>> Tìm và xóa sinh viên theo họ tên");
        System.out.println("7>> Thoát.");

    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên : ");
        hoTen = input.nextLine();
        list.add(hoTen);
        System.out.println("Nhập vào điểm trung bình : ");
        diemTB = input.nextDouble();
        input.nextLine();
        list.add(diemTB);
    }
    public void xuat(){
        System.out.println(">>>>>>DANH SÁCH SINH VIÊN<<<<<<");
        System.out.println("");
       for (Object object : list) {
        System.out.println("Họ và tên : "+hoTen);
        System.out.println("Điểm trung bình : "+diemTB);
           
       }
    }
}
