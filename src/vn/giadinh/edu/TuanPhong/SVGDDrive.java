package vn.giadinh.edu.TuanPhong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SVGDDrive {

    Scanner input = new Scanner(System.in);
    
    public List<SVGD> list ;

    public SVGDDrive(){
        list = new ArrayList<SVGD>() ;
    }
    
    public void add(){
        int yes ;
        do{
        System.out.print("Nhập vào họ và tên sinh viên : ");
        String name = input.nextLine();
        System.out.print("Nhập vào điểm số của sinh viên : ");
        Double points = input.nextDouble();

        list.add(new SVGD(list.size(), name , points));

        System.out.print("-Nhập thêm(1:Yes / 0:No): ");
        yes = input.nextInt();
        input.nextLine();
       }while(yes == 1);
    }

    public void outPut (){
         for (SVGD x : list) {
             x.inThongTin();
         }
    }

    public void outputByPoint(){
        System.out.print("Nhập vào khoảng điểm thấp nhất : ");
        double min = input.nextDouble() ;
        System.out.print("Nhập vào khoảng điểm cao nhất : ");
        double max = input.nextDouble();
        System.out.println("Sinh viên trong khoảng "+min+" tới "+max+"là : ");

        for (SVGD x : list) {
            if(x.point >= min && x.point <= max){
                x.inThongTin();
            }       
        }  
    }

    public void findByName(){
        System.out.println("Nhập vào họ tên sinh viên cần tìm kiếm : ");
        input.nextLine();
        String hoTen= input.nextLine();
        for (SVGD x : list) {
            if(x.name.contains(hoTen)){
            System.out.println("Thông tin sinh viên cần tìm : ");
            x.inThongTin();
            break ;
            }else
            System.out.println("Không tìm thấy thông tin sinh viên.");
        }
    }

    public void findAndFix(){
        System.out.print("Nhập họ tên sinh viên cần tìm và thay đổi : ");
        input.nextLine();
        String hoTen = input.nextLine();

        for (SVGD x : list) {
            if(x.name.contains(hoTen)){
                System.out.print("Nhập họ tên mới sinh viên : ");
                x.name = input.nextLine();
                System.out.println("Sau khi sửa");
                x.inThongTin();
                break ;
            }else
            System.out.println("Không tìm thấy thông tin sinh viên.");
        }
    }

    public void findAndDelete(){
        System.out.print("Nhập tên sinh viên cần tìm và xóa ra khỏi danh sách : ");
        input.nextLine();
        String hoTen = input.nextLine();

        for (SVGD x : list) {
            if(x.name.equals(hoTen)){
                list.remove(x);
                System.out.println("Xóa tên sinh viên thành công.");
                break ;
            }else
        System.out.println("Không tìm thấy sinh viên.");           
        }
    }
}
