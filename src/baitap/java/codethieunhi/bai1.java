package baitap.java.codethieunhi;

import java.util.Scanner;

public class bai1 {

    /*

          Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.

    */
    
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        clearScreen();
        
        System.out.print("Nhập vào số tự nhiên a : ");
        int a = input.nextInt();
        System.out.print("Nhập vào số tự nhiên b : ");
        int b = input.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    
    }

    public static int UCLN(int a , int b){
        while(a!=b){
            if(a>b){
                a =  a - b ;
            }else 
            b = b - a ;
        }
      return (a);
    }
    
}
