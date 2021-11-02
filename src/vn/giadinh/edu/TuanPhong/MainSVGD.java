package vn.giadinh.edu.TuanPhong;

import java.util.Scanner;

public class MainSVGD {
    public static SVGDDrive list = new SVGDDrive();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int chose ;
        do{
            System.out.println("==========MENU==========");
            System.out.println(">>1. Nhập thông tin sinh viên.");
            System.out.println(">>2. Xuất danh sách đã nhập.");
            System.out.println(">>3. Xuất danh sách theo khoảng điểm.");
            System.out.println(">>4. Tìm sinh viên.");
            System.out.println(">>5. Tìm và sửa thông tin.");
            System.out.println(">>6. Tìm và xóa thông tin.");
            System.out.println(">>7. Kết thúc.");
            System.out.print("Nhập vào sự lựa chọn: ");
            chose = input.nextInt();
            System.out.println();

            switch(chose){
                case 1 : list.add(); break ;
                case 2 : list.outPut(); break ;
                case 3 : list.outputByPoint(); break ;
                case 4 : list.findByName(); break ;
                case 5 : list.findAndFix(); break ;
                case 6 : list.findAndDelete(); break ;
                case 7 : System.out.println("Kết Thúc?"); break ;
            default :
               System.out.println("Nhập sai rồi vui lòng nhập lại");
            }

            System.out.print("Trở về menu (1.YES // Any Key.NO) : ");
            chose = input.nextInt() ;         

        }while(chose == 1);
    }


}
