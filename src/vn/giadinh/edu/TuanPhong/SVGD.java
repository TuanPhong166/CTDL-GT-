package vn.giadinh.edu.TuanPhong;

public class SVGD {

    String name  ;
    Double point ;
    int number ;

    SVGD (){} 

    SVGD(int  n ){
        number  =  n ;
    }

    SVGD(int n , String ten  ){
        number = n ;
        name = ten ;
    }

    SVGD(int n , String ten  , Double p ){
        number = n ;
        name = ten ;
        point  = p ;
    }

    void inThongTin(){
        System.out.println("Số thứ tự : "+number);
        System.out.println("Họ và tên sinh viên : "+name);
        System.out.println("Điểm số của sinh viên : "+point);
        System.out.println("");
    }
    
}
