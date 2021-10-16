package com.phongntt2005110008.tuan05;

public class QuanLiSV {

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
       
    }
