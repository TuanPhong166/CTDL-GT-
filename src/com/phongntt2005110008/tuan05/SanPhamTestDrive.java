package com.phongntt2005110008.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SanPhamTestDrive {
    static ArrayList<SanPham> list =new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
     
    static void nhap(){
        System.out.println("Nhập danh sách sản phẩm: ");
              Scanner sc = new Scanner(System.in);
              int i = 1;
          do{
              System.out.printf("Tên sản phẩm thứ %d: ", i);
              String sp=sc.nextLine();
              
              if( sp==null || sp.equals("")){
                  break;
              }
              System.out.printf("Giá sản phẩm: ");
              double gia=sc.nextDouble();
              
              list.add(new SanPham(sp,gia));
              sc.nextLine();
              i++;
          } while (true);
    }
    static void hienThi(){
        System.out.println("Danh sách sản phẩm: ");
        System.out.println("                     Tên        |Giá        ");
        list.stream().forEach((sanPham) -> {
        System.out.printf("    %20s        |%.2f \n", sanPham.getTen(), sanPham.getGia());
        });
    }

    
    static void sapXep(){
        Collections.sort(list, (a,b) -> (int) (a.getGia()-b.getGia()) );
        System.out.println("Danh sách sản phẩm sau khi đã sắp xếp: ");
        hienThi();
    }
    static void timKiem(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên của sản phẩm cần tìm và xóa: ");
        String ten=sc.nextLine();
        SanPham found = null;
        
        for(SanPham sanPham : list) {
            if (sanPham.getTen().equals(ten)){
                found = sanPham;
                break;
            }
        }
        if (found != null){
            list.remove(found);
            System.out.println("Sản phẩm đã được xóa khỏi danh sách ^_^");
        } else{
            System.out.println("Sản phẩm không có trong danh sách ^.^");
        }
    }
    static void tinhGiaTrungBinh(){
        double tb=0, tong=0;
        
        for(SanPham sanPham:list){
            tong += sanPham.getGia();
        }
        tb = tong/list.size();
        System.out.println("Giá trung bình của các sản phẩm: " +tb);
    }
    static void menu(){
        do{
       System.out.println("MENU CHƯƠNG TRÌNH"); 
       System.out.println("1. Nhập danh sách sản phẩm"); 
       System.out.println("2. Xuất danh sách sản phẩm"); 
       System.out.println("3. Sắp xếp danh sách sản phẩm"); 
       System.out.println("4. Tìm và xóa sản phẩm"); 
       System.out.println("5. Tính giá trung bình của các sản phẩm"); 
       System.out.println("6. Thoát chương trình"); 
       System.out.print("Mời bạn chọn chương trình: "); 
       Scanner sc=new Scanner(System.in);
       int chon = sc.nextInt();
       
       
       switch (chon) {
           case 1:
               nhap();
               break;
           case 2:
               hienThi();
               break;
           case 3:
               sapXep();
               break;    
           case 4:
               timKiem();
               break;    
           case 5:
               tinhGiaTrungBinh();
               break;    
           case 6:
               System.exit(0);
               break;    
           default:    
               System.out.println("Giá trị lựa chọn không đúng");   
      
       }
        }while (true);
              
    }
}
