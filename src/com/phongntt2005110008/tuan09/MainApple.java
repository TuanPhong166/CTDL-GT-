package com.phongntt2005110008.tuan09;

import java.util.Scanner;

public class MainApple {

    public static NodeAppleDrive list = new NodeAppleDrive();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int chose ;
        do{
        System.out.println(">>>>>>>Menu<<<<<<<");
        System.out.println("1>>. Thêm táo.");
        System.out.println("2>>. Sắp xếp cân nặng giảm dần.");
        System.out.println("3>>. Sắp xếp câng nặng tăng  dần.");
        System.out.println("4>>. Tìm kiếm táo theo mã sản phẩm.");
        System.out.println("5>>. Tìm kiếm táo theo màu.");
        System.out.println("6>>. Tìm kiếm táo theo cân nặng");
        System.out.println("7>>. Thoát.");
        System.out.println();
        System.out.println("Bạn lựa chọn chức năng nào ?? Vui long nhập : ");
        chose = input.nextInt();
        
        switch (chose) {
            case 1 : 
                list.add();
                break ;
            case 2:
                list.weightDown();
                break;
            case 3:
                list.weightUp();
                break ;
            case 4 :
                list.findByNumber();
                break ;
            case 5 :
                list.findByColor();
                break ;
            case 6 : 
                list.findByWeight();
                break ;
            case 7 :
                System.out.println("Kết Thúc Chương Trình.");
        
            default:
                System.out.println("Lựa chọn sai !! Vui lòng lựa chọn lại");
                break;
        }

    }while(chose!=7);
}
    
}
