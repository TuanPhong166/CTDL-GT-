package com.phongntt2005110008.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bai1 {
    public List<Apple> list ;

    public Bai1(){
        list = new ArrayList<Apple>();
    }
    public void them(){
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập khối lượng sản phẩm Táo : ");
        double khoiLuong = bienNhap.nextDouble();

        System.out.println("Nhập vào màu sản phẩm táo :");
        bienNhap.nextLine();
        String color =bienNhap.nextLine();

        list.add(new Apple(list.size(),khoiLuong,color));
        System.out.println();

    }
    public void output(){
        for (Apple x : list) {
            x.inThongTin();
        }
        System.out.println();
        System.out.println("><><><><><><><><><><");
        System.out.println();
    }
    public void search(String color){
    int  bienDem = 0 ;
    for (Apple x : list) {
        if(x.color.equals(color)){
            bienDem ++ ;
            x.inThongTin();
        }
    }
    if(bienDem == 0){
        System.out.println("Danh sách tìm không ra màu này "+color);
    }
    System.out.println();
    System.out.println("><><><><><><><><><><");
    System.out.println();
    }

}