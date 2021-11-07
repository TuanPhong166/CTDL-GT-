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
            if(x.name.equalsIgnoreCase(hoTen)){
            System.out.println("Thông tin sinh viên cần tìm : ");
            x.inThongTin();
            }else
            System.out.println("Không tìm thấy thông tin sinh viên.");
            break ;
        }
    }

    public void findAndFix(){
        System.out.print("Enter the name of the student you want to find and fix from the list  : ");
        input.nextLine();
        String fullName = input.nextLine();

        for (SVGD x : list) {
            if(x.name.equalsIgnoreCase(fullName)){
                System.out.print("Enter the new name of the student : ");
                x.name = input.nextLine();
                System.out.println("After repair.");
                x.inThongTin();
            }else
            System.out.println("No data found.");
            break ;
        }
    }

    public void findAndDelete(){
        System.out.print("Enter the name of the student you want to find and remove from the list : ");
        input.nextLine();
        String fullName = input.nextLine();

        for (SVGD x : list) {
            if(x.name.contains(fullName)){
                list.remove(x);
                System.out.println("Delete student name successfully.");
                break ;
            }else
        System.out.println("No data found.");           
        }
    }
}
