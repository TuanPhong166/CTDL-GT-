package com.phongntt2005110008.tuan09;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NodeAppleDrive {

    public List<Node> list = new ArrayList<>();

    public Scanner input = new Scanner(System.in);

    Node head ;

    public void add(){
        int yes ;
        do{
        System.out.print("Nhập mã sản phẩm táo : ");
        int number = input.nextInt();
        System.out.print("Nhập vào cân nặng sản phẩm táo (Kg) : ");
        Double weight = input.nextDouble();
        System.out.print("Nhập vào màu sắc sản phẩm táo : ");
        input.nextLine();
        String color = input.nextLine();

        list.add(new Node(number, weight , color));

        System.out.print("-Nhập thêm(1:Yes / 0:No): ");
        yes = input.nextInt();
        input.nextLine();
       }while(yes == 1);
    }

    
    public void weightDown (){   

        System.out.println("Em hong biết làm.");

   
    }

    public void weightUp(){

        Node current = head;
        Node index = null;
        double temp;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.weight > index.weight) {
                        
                        temp = current.weight;
                        current.weight = index.weight;
                        index.weight = temp;
                        
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }

    }

    public void findByNumber(){
        System.out.println("Nhập vào mã sản phẩm táo cần tìm :");
        int n = input.nextInt();

        Node current = head;
        while(current != null){
            if(current.number == n){
                System.out.println("Tìm kiếm theo mã sản phẩm táo: ");
                current.inThongTin();
                return;
            }
            current = current.next;
        }
        System.out.println("Không có táo theo mã cần tìm.");
    }
      

    

    public void findByColor(){

        System.out.println("Nhập vào màu sản phẩm táo cần tìm :");
        String mau = input.nextLine();

        Node current = head;
        while(current != null){
            if(current.color == mau){
                System.out.println("Tìm kiếm theo màu sản phẩm táo: ");
                current.inThongTin();
                return;
            }
            current = current.next;
        }
        System.out.println("Không có táo theo màu cần tìm.");

    }
    public void findByWeight(){
        
        
        System.out.println("Nhập vào cân nặng sản phẩm táo cần tìm :");
        Double canNang = input.nextDouble();

        Node current = head;
        while(current != null){
            if(current.weight == canNang){
                System.out.println("Tìm kiếm theo cân nặng sản phẩm táo: ");
                current.inThongTin();
                return;
            }
            current = current.next;
        }
        System.out.println("Không có táo theo cân nặng cần tìm.");

        
    }

}
