package vn.giadinh.edu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

    public List<Book> list ;

    public BookStore (){
        list  = new ArrayList<Book>() ;
    }

    public static Scanner input = new Scanner(System.in);
    
    public void add(){
        int yes ;
        do{
        System.out.print("Nhập vào đơn giá sản phẩm sách : ");
        Double donGia = input.nextDouble();
        System.out.print("Nhập vào số lượng sản phẩm sách : ");
        input.nextLine();
        int soLuong  = input.nextInt();
        System.out.print("Nhập vào màu sản phẩm sách : ");
        input.nextLine();
        String color = input.nextLine();

        list.add(new Book(list.size() , donGia, soLuong , color));

        System.out.print("-Nhập thêm(1:Yes / 0:No): ");
        yes = input.nextInt();
        input.nextLine();
       }while(yes == 1);
    }

    public void search(Double donGia){
        int  count = 0 ;
    for (Book x : list) {
        if(x.color.equals(donGia)){
            count ++ ;
            x.inThongTin();
        }
    }
    if(count == 0){
        System.out.println("Danh sách tìm không ra  "+donGia);
    }
    System.out.println();
    }

    public void outPut(){
        for (Book book : list) {
            book.inThongTin();
        }
    }
    
}
