package vn.giadinh.edu.Menu;

import java.util.Scanner;

public class HocSinh {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Add();
        hienThiSo();

      
    }
    static void Add(){
        System.out.println("Nhập vào tổng các số : ");
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i++){
        System.out.printf("Nhập số nguyên thứ "+ i + " : ");
        int number = input.nextInt();    
        }
    }
    static void hienThiSo(){
        for(int i = 0 ; i <= 8 ; i++){
            if(i < 0){
                System.out.println("Số âm là : "+i);
                
            }else
            System.out.println("Số dương là : "+i);
           
    }
    
}
}
