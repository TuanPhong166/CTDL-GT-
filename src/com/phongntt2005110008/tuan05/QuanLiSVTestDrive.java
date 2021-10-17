package com.phongntt2005110008.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSVTestDrive {

    static Scanner input = new Scanner(System.in);
    
    static ArrayList<QuanLiSV> DSSV = new ArrayList<>();
    public static void main(String[] args) {
        int chose;
        do{
            System.out.println("==========MENU==========");
            System.out.println(">>1. Nhập thông tin sinh viên.");
            System.out.println(">>2. Xuất danh sách đã nhập.");
            System.out.println(">>3. Xuất danh sách theo khoảng điểm.");
            System.out.println(">>4. Tìm sinh viên.");
            System.out.println(">>5. Tìm và sửa thông tin.");
            System.out.println(">>6. Tìm và xóa thông tin.");
            System.out.println(">>7. Kết thúc.");
            System.out.print("Nhập vào sự lựa chọn: ");
            chose = input.nextInt();
            switch(chose){
                case 1: 
                        input();
                        break;
                case 2: 
                        output();
                        break;
                case 3:
                        outputByPoint();
                        break;
                case 4: 
                        search();
                        break;
                case 5: 
                        findAndFix();
                        break;
                case 6: 
                        findAndDelete();
                        break;
                case 7:
                        System.out.println("KẾT THÚC!");
                        break;
                default: 
                        System.out.println("Lựa chọn không hợp lệ!");

            }
            System.out.print("- Quay lại MENU(1:Yes / 0:No): ");
            chose = input.nextInt();
        }while(chose == 1);

    }
    static void input(){
        int yes;
        do{
                System.out.println("- Nhập thông tin của sinh viên: ");
                // tạo đối tượng sinh viên
                QuanLiSV sv = new QuanLiSV();
                sv.nhapThongTin();
                System.out.println();
                DSSV.add(sv);
                System.out.print("- Nhập thêm(1:Yes / 0:No): ");
                yes = input.nextInt();
                input.nextLine();
        }while(yes == 1);
    }
    static void output(){
        for(QuanLiSV x : DSSV){
            x.inThongTin();
        }
    }
    static void outputByPoint(){ // xuát theo điểm
        System.out.print("Nhập điểm min: ");
        double min = input.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = input.nextDouble();
        System.out.println("-Danh sách sinh viên trong khoảng " +min+ "đến" +max+ "là: ");
        for(QuanLiSV x : DSSV){
                if(x.diemTB >= min && x.diemTB <= max){
                        x.inThongTin();
                }
        }
    }
    static void search(){ // tìm kiếm 
        System.out.print("Nhập họ tên sinh viên cần tìm: ");
        input.nextLine();
        String hoTen = input.nextLine();
        for(QuanLiSV x : DSSV){
                if(x.hoVaTen.contains(hoTen)){ //.contains kiểm tra sự tồn tại
                        System.out.println("-----Thông tin sinh viên cần tìm-----");
                        x.inThongTin();
                }
        }  
    }
    static void findAndFix(){ // tìm và sửa
        System.out.print("Nhập tên sinh viên cần sửa điểm: ");
        input.nextLine();
        String hvt = input.nextLine();
        for(QuanLiSV x : DSSV){
                if(x.hoVaTen.contains(hvt)){  //.contains kiểm tra sự tồn tại
                        System.out.print("Nhập điểm mới: ");
                        x.diemTB = input.nextDouble();
                        System.out.println("-----Sau khi sửa-----");
                        x.inThongTin();
                }
        }
    }
    static void findAndDelete(){ // tìm và xóa.
            System.out.print("Nhập tên sinh viên cần xóa: ");
            input.nextLine();
            String ht = input.nextLine();
            for(QuanLiSV x : DSSV){
                    if(x.hoVaTen.equals(ht)){
                        DSSV.remove(x); // .remove phần tử
                        System.out.println("Xóa thành công!");
                        break;
                    }
            }

    }
}
    

