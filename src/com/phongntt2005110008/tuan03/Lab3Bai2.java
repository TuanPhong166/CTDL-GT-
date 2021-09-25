package com.phongntt2005110008.tuan03;

import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số cần xem bảng cửu chương : ");
        int x = input.nextInt() ;
          
        for  (int i = 2 ; i <= 10 ; i ++){
            System.out.printf("%d x %d = %d",x,i,x*i);
            System.out.println();
        }
        // Xuất 9 bảng cửu chương 
        
      /*  for(int i = 1 ;  i <= 9 ; i++){
            for(int j =1 ; j<=10 ; j++)
            System.out.printf("> %d x %d = %d  ", i, j, i*j);
            System.out.println();
        }    
        */
    }  
}
