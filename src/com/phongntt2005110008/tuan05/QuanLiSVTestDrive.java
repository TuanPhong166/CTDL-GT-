package com.phongntt2005110008.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSVTestDrive {

    static ArrayList<QuanLiSV> listSV = new ArrayList<>();
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chose ;
        do{
        menu();
        System.out.println("Bạn chọn nào ?");  
        chose = input.nextInt();

        switch (chose) {
            case 1:
               nhap();
               break;
            case 2 :
               xuat();
               break ;
        
            default:
                break;
        }
    }while (chose >= 1 && chose !=7 );
        
            

    }

        static void menu(){
            System.out.println("1>> Nhập danh sách sinh viên.");
            System.out.println("2>> Xuất danh sách sinh viên đã nhập.");
            System.out.println("3>> Xuất danh sách sinh viên theo khoảng điểm.");
            System.out.println("4>> Tìm sinh viên theo họ tên.");
            System.out.println("5>> Tìm và sửa sinh viên theo họ tên.");
            System.out.println("6>> Tìm và xóa sinh viên theo họ tên");
            System.out.println("7>> Thoát.");
    
        }
        public static void nhap(){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào số sinh viên : ");
            Double number = input.nextDouble();
            for(int i = 0 ; i <= number ; i++){
            System.out.print("Nhập vào họ và tên : ");
            String hoTen = input.nextLine();
            System.out.println("Nhập vào điểm trung bình : ");
            double diem = input.nextDouble();
            input.nextLine();
            QuanLiSV newSv = new QuanLiSV(hoTen,diem);
            listSV.add(newSv);
            }
            QuanLiSV newSv = new QuanLiSV();
            listSV.add(newSv);
        }
        public static void xuat(){
            System.out.println(">>>>>>DANH SÁCH SINH VIÊN<<<<<<");
            System.out.println("");
            for (QuanLiSV quanLiSV : listSV) {
                quanLiSV.inThongTin();
                System.out.println("");
            }
        
               
           }
}
    

