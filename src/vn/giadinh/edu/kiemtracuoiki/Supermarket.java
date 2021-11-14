package vn.giadinh.edu.kiemtracuoiki;

import java.util.Scanner;

public class Supermarket {

    String commodities  ; // hàng hóa
    int commodityCodes ; // mã hàng hóa
    String goodsName ; // tên hàng hóa
    Double importPrice ; // giá nhập 
    int inventoryNumber ; // số lượng tồn kho
    String inputDay ; // ngày nhập kho

    Scanner input = new Scanner(System.in);

    public Supermarket(){
    }

    public Supermarket(String _commodities , int _commodityCode ,String _goodsName , Double _importPrice , int _inventoryNumber, String _inputDay){
        commodities = _commodities ;
        commodityCodes = _commodityCode ;
        goodsName = _goodsName ;
        importPrice = _importPrice ;
        inventoryNumber = _inventoryNumber ;
        inputDay = _inputDay ;
    }

    void inThongTin(){
        System.out.println("Loại hàng hóa : "+commodities);
        System.out.println("Mã hàng hóa : "+commodityCodes);
        System.out.println("Tên hàng hóa : "+goodsName);
        System.out.println("Giá hàng hóa nhập vào : "+importPrice+ " VNĐ.");
        System.out.println("Số lượng "+goodsName+" tồn kho : "+inventoryNumber);
        System.out.println("Ngày nhập kho : "+inputDay);
        System.out.println();
    }

    void nhapThongTin(){
        System.out.println("Loại hàng hóa : ");
        commodities = input.nextLine();
        System.out.println("Mã hàng hóa : ");
        commodityCodes = input.nextInt() ;
        System.out.println("Tên hàng hóa : ");
        input.nextLine();
        goodsName = input.nextLine() ;
        System.out.println("Giá hàng hóa nhập vào : ");
        importPrice = input.nextDouble();
        System.out.println("Số lượng tồn kho : ");
        inventoryNumber = input.nextInt();
        System.out.println("Ngày nhập kho : ");
        input.nextLine();
        inputDay = input.nextLine();
    }








    
}
