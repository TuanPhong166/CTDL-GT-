package vn.giadinh.edu.tuan05;

public class LiThuyetTuan5 {
    
    public static void main(String[] args) {
        int []arr = {3,5,7,9} ;
        int newElement = 8 ;// phần tử cần thêm vào
        // chiều dài của mảng cũ
        int n = arr.length;
        // tạo mảng mới
        int []newarr = new int[n+1];
        // đổi dữ liệu mảng cũ sang mảng mới
        for(int i = 0 ; i<n ; i++){
            newarr[i]=arr[i];
        }

        System.out.println("In mảng cũ");
        for(int x : arr){
            System.out.println(x);
        }
        // thêm phần tử vào mảng mới
        newarr[n]= newElement;
        System.out.println("In mảng mới");
        for(int x : newarr){
            System.out.println(x);
        }
        
    }
}
