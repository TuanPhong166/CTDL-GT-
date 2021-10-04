package com.phongntt2005110008.tuan02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2Bai2 {
    
    public static void main(String[] args) {
        
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
       Scanner scanner = new Scanner(System.in) ;
       System.out.println("Enter the number system of quadratic equations : ");
       System.out.print("Number A : ");
       int a  = scanner.nextInt();
       System.out.print("Number B : ");
       int b = scanner.nextInt();
       System.out.print("Number C : ");
       int c = scanner.nextInt();
       System.out.println("Equacation : "+a+"x^2 + "+b+"x + "+c+" = 0.");
       
       if (a == 0) {
          if (b == 0) {
            System.out.println("The equation has no solution.");// VSN
          }else {
            double solution = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("The equation with a solution : "+ decimalFormat.format(solution)+ ".");
        }
        }  else {
            double delta = Math.pow(b,2)-4*a*c ;
            if(delta>0){
              double   x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
              double   x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
              System.out.println("The equation has 2 distinct solutions : X1 = "+ decimalFormat.format(x1) + ";  X2 = "+ decimalFormat.format(x2) );
            }else if(delta == 0){
               double x = (double) -b/(2*a); // nghiệm kép
               System.out.println("Equation with double solutions : "+ decimalFormat.format(x)+".");
            }else  
               System.out.println("The equation has no solution."); // VN
          
         }

    }
}

