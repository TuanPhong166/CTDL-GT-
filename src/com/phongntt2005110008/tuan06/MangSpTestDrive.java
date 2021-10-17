package com.phongntt2005110008.tuan06;

import java.util.Arrays;
import java.util.Scanner;

public class MangSpTestDrive {

    static MangSp []mangSanPham = new MangSp[3];

    public static void main(String[] args) {
        menu();
    }


    
     static void  nhap(){
        Scanner input = new Scanner(System.in);
        // nhập số lượng sinh viên 
        System.out.println("Mời nhập thông tin.");
        for(int i = 0 ; i < mangSanPham.length ; i++){
            System.out.print("Nhập vào tên sản phẩm : ");
            String tenSp= input.nextLine();
            System.out.print("Nhập giá sản phẩm : ");
            double giaSp = input.nextDouble();
            input.nextLine();
            System.out.print("Giảm giá : ");
            double giamGia= input.nextDouble();
            input.nextLine();
            System.out.println();
            mangSanPham[i] = new MangSp(tenSp,giaSp,giamGia);
        }
    }  
    static void sapXep(){

      System.out.println("Đang xủ lí");
  
    }
    static void tinhTB(){
        
    }

        
        
    
    static void xuatSp(){
        System.out.println(">>>>>In Danh Sách<<<<<");
        for (MangSp mangSp : mangSanPham) {
            mangSp.inThongTin();
            System.out.println();
        }
    }
    static void menu(){
        int chon ;
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
            chon = sc.nextInt();
            
            
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuatSp();
                    break;
                case 3:
                    sapXep();
                    break;    
                case 4:
                    
                    break;    
                case 5:
                    
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
    


