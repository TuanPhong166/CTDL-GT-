package com.phongntt2005110008.kiemtragiuaky;
import java.util.Scanner;

public class Bai1TestDrive {
    public static Bai1 listApple = new Bai1();
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
		int chose ;
        do{
    		System.out.println(">>>>>MENU<<<<<");
            System.out.println("1>>.Thêm sản phẩm táo ");
            System.out.println("2>>.Tìm sản phẩm táo theo màu ");
            System.out.println("3>>.In danh sách sản phẩm táo");
            System.out.println("4>>. Thoát ");
            System.out.println("");
            System.out.print("Lựa chọn chức năng: ");
            chose = bienNhap.nextInt();
        	
        	switch(chose){
        	case 1:	nhapThem();break;
        	case 2: TimKiem();break;
        	case 3: output();break;
            case 4 : System.out.println("Kết Thúc??"); break ;
        	default: break;
        	}
        }while(chose != 4);
	}
	
	public static void nhapThem() {
		listApple.them();
		System.out.println();
		System.out.println("><><><><><><><><><><");
        System.out.println();
	}
	
	
	
	public static void output() {
		listApple.output();
		System.out.println();
		System.out.println("><><><><><><><><><><");
        System.out.println();
	}

    public static void TimKiem() {
		System.out.print("Nhập màu táo muốn tìm: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		System.out.print("Các trái táo màu Đỏ:");
		listApple.search(color);
		System.out.println();
		System.out.println("><><><><><><><><><><");
        System.out.println();
	}
}
