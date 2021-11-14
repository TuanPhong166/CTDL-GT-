package vn.giadinh.edu.kiemtracuoiki;

import java.util.Scanner;

public class MainSupermarket {

    public static Scanner input = new Scanner(System.in);
    public static MenuSupermarket menuSupermarket = new MenuSupermarket();
    public static void main(String[] args) {
        // mảng có kiểu dữ liệu tham chiếu đối tượng
        Supermarket []danhSachHangHoa  = new Supermarket[20] ;

        Supermarket supermarket0 = new Supermarket("Thực phẩm", 1 , "Chuối" , 25.500 , 23 , "12-11-2020");
        danhSachHangHoa[0] = supermarket0 ;


        int chose ;
        clearScreen();
        do{
        menuSupermarket.menu();
        System.out.print("-Nhập vào sự lựa chọn : ");
        chose = input.nextInt() ;
        System.out.println();
        switch (chose) {
            case 1:
                System.out.println("1.>> Chỉnh sửa hàng hóa.");
                menuSupermarket.menuRepair();
                break;
            case 2 : 
                System.out.println("2.>> Tìm kiếm hàng hóa.");
                menuSupermarket.searchMenu();
                break ;
            case 3 :
                System.out.println("3.>> Sắp xếp hàng hóa.");
                menuSupermarket.menuArrangement();
                break ;
            case 4 : 
                System.out.println("4.>> Thống kê hàng hóa.");
                menuSupermarket.menuStatistics();
                break ;
            case 5 :
                System.out.println("5.>> In danh sách hàng hóa");
                menuSupermarket.menuPrintList();              
                break ;
            case 6 : 
                System.out.println("Thoát khỏi chương trình.");
                break ;
        
            default:
                 System.out.println("Nhập sai rồi. Vui lòng nhập lại!!!");
                break;
        }
        System.out.println();
        System.out.print("- Quay lại MENU CHƯƠNG TRÌNH CHÍNH (1:Yes / 0:No): ");
        chose = input.nextInt();
    }while(chose == 1);
    }

    public static void clearScreen() { // HÀM XÓA MÀN HÌNH
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
