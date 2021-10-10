package com.phongntt2005110008.tuan05;

import java.util.Scanner;

public class Lab5Bai2TestDrive {
    public static void main(String[] args) {
        // khai báo đối tượng 
        Lab5Bai2 bai2 = new Lab5Bai2();
        int chose ;
        Scanner input = new Scanner(System.in);
        do{
        bai2.menu();
        System.out.println("Nhập vào chức năng bạn chọn :");
        chose = input.nextInt();
        switch(chose){
            case 1 : bai2.nhap(); break ;
            case 2 : bai2.xuat(); break ;
            case 3 : bai2.sapXep(); break ;
            case 4 : bai2.xuatNgauNhien(); break ;
            case 5 : bai2.timVaXoa(); break ;
            case 6 : break ;
        default :
         System.out.println("Bạn chọn sai rồi. Vui lòng chọn lại!!!");
        }

        }while (chose >= 1 && chose <= 5);

    }
    
}