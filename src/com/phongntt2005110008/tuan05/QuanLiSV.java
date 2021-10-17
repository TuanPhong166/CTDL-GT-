package com.phongntt2005110008.tuan05;

import java.util.Scanner;

public class QuanLiSV {
    static Scanner input = new Scanner(System.in);
    public static final String remove = null;
    // bài làm chưa xong 
    public static String hoTen ;
    public static Double diem ;

    public QuanLiSV(){}

    public QuanLiSV(String t , double d ){
        hoTen = t ;
        diem = d ;
    }
    

    void inThongTin(){
        System.out.println("Họ và tên sinh viên : "+hoTen);
        System.out.println("Điểm số  : "+diem);
    }
    void nhapThongTin(){
        System.out.print("Nhập họ và tên: ");
        hoTen = input.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diem = input.nextDouble();

    }
       
    }
