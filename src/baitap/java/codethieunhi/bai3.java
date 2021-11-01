package baitap.java.codethieunhi;

import java.util.Scanner;

/*
 
Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. 
Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.

*/

public class bai3 {
    public static int nhap(){

        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int tinhTong(long i){
        int sum=0;
        long n;
        while(i!=0){
            n= i%10;
            sum+= n;
            i/=10;
        }
        return (sum);
    }
    public static void main(String[] args){
        System.out.print("Nhap n");
        int n= nhap();
        System.out.println("Tong cua so "+n+" = " +tinhTong(n));
    }
    
}
