package vn.giadinh.edu.TuanPhong;

import java.util.ArrayList;
import java.util.Scanner;


public class AppleTestDrive {

    static ArrayList<Apple> listApple = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }

    static  void input(){
        int yes;
        do{
                System.out.println("- Nhập thông tin của quả Táo: ");
                // tạo đối tượng táo 
                Apple apple = new Apple();
                apple.nhapThongTin();
                System.out.println();
                listApple.add(apple);
                
                System.out.print("- Nhập thêm(1:Yes / 0:No): ");
                yes = input.nextInt();
                input.nextLine();
        }while(yes == 1);
    }

    static void search(){ // tìm kiếm 
        System.out.print("Nhập màu sản phẩm táo cần tìm : ");
        input.nextLine();
        String mauSac = input.nextLine();
        for(Apple x : listApple){
                if(x.color.contains(mauSac)){ //.contains kiểm tra sự tồn tại
                        System.out.println("-----Thông tin màu Táo cần tìm-----");
                        x.inThongTin();
                }
        }  
    }

    static void output(){
        for(Apple x : listApple){
            x.inThongTin();
        }
    }

    // menu
    public static void menu(){
        int chose ;
        do{
            System.out.println(">>>>>>Menu<<<<<");
            System.out.println("1>>. Thêm táo vào kho.");
            System.out.println("2>>. Tìm táo theo màu.");
            System.out.println("3>>. In danh sách táo.");
            System.out.println("4>>. Kết thúc.");
            System.out.print("Nhập vào sự lựa chọn: ");
            chose = input.nextInt();
            switch (chose) {
                case 1:
                    input();
                    break;
                case 2:
                    search();
                    break ;
                case 3 :
                    output();
                    break ;
                case 4 : 
                    System.out.println("KẾT THÚC");
                    break ;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
            System.out.print("- Quay lại MENU(1:Yes / 0:No): ");
            chose = input.nextInt();
        }while (chose == 1);
        
    }
}

    

