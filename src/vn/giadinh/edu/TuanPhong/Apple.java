package vn.giadinh.edu.TuanPhong;

import java.util.Scanner;

public class Apple {
    
    int maTao ;
    double khoiLuong ;
    String color ;
    
    Scanner input = new Scanner(System.in);

    public Apple (){} ;

    public Apple(int ma){
        maTao = ma ;
    }

    public Apple(int ma , double kL){
        maTao = ma ;
        khoiLuong = kL;
    }

    public Apple (int ma , double kL , String c){
        maTao = ma ;
        khoiLuong = kL ;
        color = c ;
    }
    
    void    inThongTin(){
        System.out.println("Mã sản phẩm Táo : "+maTao);
        System.out.println("Khối Lượng sản phẩm Táo : "+khoiLuong);
        System.out.println("Màu sắc sản phẩm táo : "+color);
    }
    void nhapThongTin(){
        System.out.println("Mã Táo : ");
        maTao = input.nextInt();
        System.out.println("Khối Lượng sản phẩm Táo : ");
        khoiLuong = input.nextDouble();
        input.nextLine();
        System.out.println("Màu sắc sản phẩm Táo : ");
        color = input.nextLine();

    }
    
}
