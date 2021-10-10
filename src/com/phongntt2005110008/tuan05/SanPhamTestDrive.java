package com.phongntt2005110008.tuan05;

import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class SanPhamTestDrive {

    public static Scanner input = new Scanner(System.in);
    static ArrayList<SanPham> listSp = new ArrayList<>() ;

    public static void main(String[] args) {
        

        int chose ;
        do{
            menu() ;
            System.out.println("Bạn chọn chức năng nào ? ");
            System.out.print("Mới bạn nhấp số : ");
            chose = input.nextInt();
        switch (chose) {
            case 1:
                nhapSp();
                break;
            case 2 :
                xuatSP();
                break ;
            case 3 :
                sapXep();
                break ;
            case 4 :
                
            
            default:
                System.out.println("Bạn chọn sai rồi. Vui lòng chọn lại!!!");
                break;
        } 
    } while ( chose >= 1 && chose !=5);

    }

    
    
    public static void menu (){
        System.out.println("1>> Nhập dánh sách sản phẩm từ bàn phím.");
        System.out.println("2>> Sắp xếp giảm dần theo giá và xuất ra màn hình.");
        System.out.println("3>> Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
        System.out.println("4>> Xuất giá trung bình của các sản phẩm.");
        System.out.println("5>>  Thoát.");
    }
    public static void nhapSp(){
        SanPham sp = new SanPham();
        System.out.println("Nhập số lượng danh sách sản phẩm : ");
        int n = input.nextInt();
        for (int i=1 ; i <= n ; i++ ){
        System.out.print("Nhập tên sản phẩm: ");
        sp.tenSp = input.next();
        System.out.print("Nhập đơn giá sản phẩm: ");
        sp.donGia = input.nextDouble();
        System.out.print("Nhập mã giảm giá: ");
        sp.giamGia = input.nextDouble();
        listSp.add(sp);
        }
    }
    public static void xuatSP(){
        for (SanPham sanPham : listSp) {
            System.out.printf("Tên sản phẩm %s \n Giá sản phẩm %s \n Mã giảm giá %s \n Thuế nhập khẩu %s \n",sanPham.tenSp,sanPham.donGia,sanPham.giamGia,sanPham.thueNhapKhau);
            
        }
    }
    public static void sapXep(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) { 
                return Double.compare(o1.donGia, o2.donGia);
            }
            };
        Collections.sort(listSp, comp);
            
    }
}
