package vn.giadinh.edu.tuan04;

import java.util.Arrays;

public class LiThuyetTuan4 {

    public static void main(String[] args) {
        
     // cú pháp khai báo mảng
     int[] mangSoNguyen ; // chỉ định số phần tử

     mangSoNguyen = new int[5] ; // mảng trong java là 1 kiểu tham chiếu đối tượng


     double mangSoThuc[] = new double[10] ;
 

     //trước khi dùng thì phải xác định số phần tử của mảng
     mangSoNguyen[0] = 2;
     // KHAI BÁO CÓ KHỞ TẠO GIÁ TRỊ CHO HẰNG
     double diemMonHoc[] = new double[]{10.5, 5.5, 3.0 , 4.5};
     System.out.println("Mảng điểm môn học"+Arrays.toString(diemMonHoc));

     diemMonHoc[1] = diemMonHoc[2] ;
     System.out.println("Mảng điểm môn học"+Arrays.toString(diemMonHoc));

     System.out.println("Số phần tử của mảng điêm môn học"+diemMonHoc.length);
    

     // Cách 2
     String dsTenSv[] = {"Phong","Khùng"} ;
     
     // dùng vòng lặp for để duyệt mảng
     System.out.println(">>>>Duyệt Mảng<<<<");

     for(int i = 0; i < diemMonHoc.length ; i++){
         System.out.println(diemMonHoc[i]);
     }

     //FOR - EACH 
     System.out.println(">>>>>For-Each<<<<<");
     for(double diem : diemMonHoc){
         System.out.println(diem);
     }

     // mảng có kiểu dữ liệu thma chiếu đối tượng
     Dog []danhSachDog = new Dog[7] ;

     Dog dog0 = new Dog(17 , "Đen" ,"Fido");
     Dog dog1 = new Dog(18, "Vàng", "La La");
     Dog dog2 = new Dog(19 , "Đỏ Lét", "Milu");
     Dog dog3 = new Dog(20, "Cam Lè","HiLu");
     Dog dog4 = new Dog(21,"Xanh","KiLu");
     Dog dog5 = new Dog(22,"Đen","LiLu");
     Dog dog6 = new Dog(23,"Trắng","ZiLu");

     danhSachDog[0] = dog0 ;
     danhSachDog[1] = dog1 ;
     danhSachDog[2] = dog2 ;
     danhSachDog[3] = dog3 ;
     danhSachDog[4] = dog4 ;
     danhSachDog[5] = dog5 ;
     danhSachDog[6] = dog6 ;
      
     // duyệt mảng danh sách Dog

     System.out.println(">>>>>For-Each<<<<<");
     for(Dog dog : danhSachDog){
         dog.inThongTin();
     }
    
 }

}

    
