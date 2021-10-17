package com.phongntt2005110008.tuan05;

import java.util.Scanner;

public class QuanLiSV {
    public static final String remove = null;
    String hoVaTen;
    Double diemTB;
    Scanner input = new Scanner(System.in);
    
    QuanLiSV(){

    }
    void inThongTin(){
        System.out.println("Họ và tên: " +hoVaTen);
        System.out.println("Điểm trung bình: " +diemTB);
        System.out.println("");
    }
    void nhapThongTin(){
            System.out.print("Nhập họ và tên: ");
            hoVaTen = input.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            diemTB = input.nextDouble();
            System.out.println("");
    }
    }
