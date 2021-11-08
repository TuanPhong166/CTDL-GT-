package vn.giadinh.edu.Menu;

import java.util.Scanner;

public class MainBook {

    public static BookStore listBook = new BookStore();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int chose ;
        do{
    		System.out.println(">>>>>MENU<<<<<");
            System.out.println("1>>.Thêm sản phẩm sách ");
            System.out.println("2>>.Tìm sản phẩm sách theo đơn giá ");
            System.out.println("3>>.In danh sách sản phẩm sách");
            System.out.println("4>>. Thoát ");
            System.out.println("");
            System.out.print("Lựa chọn chức năng: ");
            chose = input.nextInt();
        	
        	switch(chose){
        	case 1:	add();break;
        	case 2: finByColor();break;
        	case 3: outPut();break;
            case 4 : System.out.println("Kết Thúc??"); break ;
        	default: break;
        	}
        }while(chose != 4);
    }
    
    public static void finByColor(){
        System.out.print("Nhập đơn giá muốn tìm: ");
	    input.nextLine();
		Double donGia = input.nextDouble();
		System.out.print("Các sản phẩm sách theo đơn giá muốn tìm :");
		listBook.search(donGia);
		System.out.println();		
    }

    public static void add(){
        listBook.add();
        System.out.println();
    }

    public static void outPut(){
        listBook.outPut();
        System.out.println();
    }
}
