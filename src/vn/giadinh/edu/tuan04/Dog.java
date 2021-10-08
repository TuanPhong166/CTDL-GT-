package vn.giadinh.edu.tuan04;

public class Dog {

    public   String name ;
    public int size ;

    public String color ;

    public Dog(){
    }

    public Dog(int s){

        size = s ;

    }

    public Dog(int s , String c, String n){
       size = s ;
       color  = c ; 
       name = n ; 
    }
    
    void inThongTin(){
        System.out.println("Name :"+name+ ". Size = "+size+". Color = "+color);
    }
}
