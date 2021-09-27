package vn.giadinh.edu;

import java.util.Arrays;

public class tuan04 {

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
        }
    
}
