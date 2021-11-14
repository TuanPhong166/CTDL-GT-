package vn.giadinh.edu.kiemtracuoiki;

import java.util.Scanner;

public class MenuSupermarket {

    public Scanner input = new Scanner(System.in);

    public void menu(){
        System.out.println("================ MENU ================");
        System.out.println("|    1.>> Chỉnh sửa hàng hóa.        |");
        System.out.println("|    2.>> Tìm kiếm hàng hóa.         |");
        System.out.println("|    3.>> Sắp xếp hàng hóa.          |");
        System.out.println("|    4.>> Thống kê hàng hóa          |");
        System.out.println("|    5.>> In danh sách hàng hóa      |");
        System.out.println("|    5.>> Thoát chương trình.        |");
        System.out.println("======================================");

    }
    
    public void menuRepair (){
        int chose ;
        do{
        System.out.println("======== MENU CHỈNH SỬA HÀNG HÓA ========");
        System.out.println("|  1.>> Thêm hàng hóa.                  |");
        System.out.println("|  2.>> Xóa hàng hóa.                   |");
        System.out.println("|  3.>> Sửa hàng hóa.                   |");
        System.out.println("=========================================");
        System.out.print("-Nhập vào sự lựa chọn : ");
        chose = input.nextInt() ;
        System.out.println();
        switch (chose) {
            case 1:
                System.out.println("1.>> Thêm hàng hóa.");
                break;
            case 2:
                System.out.println("2.>> Xóa hàng hóa.");
                break ;
            case 3 :
                System.out.println("3.>> Sửa hàng hóa.");
                break ;
            default:
                System.out.println("Chọn sai rồi. Vui lòng chọn lại!!!");
                break;
        }
        System.out.print("- Quay lại MENU CHỈNH SỬA HÀNG HÓA (1:Yes / 0:No): ");
        chose = input.nextInt();
    }while(chose == 1);
    }

    public void  searchMenu(){
        int chose ;
        do{
        System.out.println("=============MENU TÌM KIẾM HÀNG HÓA===============");
        System.out.println("|  1.>> Tìm kiếm hàng hóa theo loại.             |");
        System.out.println("|  2.>> Tìm kiếm hàng hóa theo giá.              |");
        System.out.println("|  3.>> Tìm kiếm hàng hóa theo khoảng giá.       |");
        System.out.println("|  4.>> Tìm kiếm theo ngày nhập.                 |");
        System.out.println("|  5.>> Tìm kiếm theo trong khoảng các ngày nhập.|");
        System.out.println("==================================================");
        System.out.print("-Nhập vào sự lựa chọn : ");
        chose = input.nextInt() ;
        System.out.println();
        switch (chose) {
            case 1:
                System.out.println("1.>> Tìm kiếm hàng hóa theo loại");
                break;
            case 2 : 
                 System.out.println("2.>> Tìm kiếm hàng hóa theo giá.");
                break ;
            case 3 :
                System.out.println("3.>> Tìm kiếm hàng hóa theo khoảng giá.");
                break ;
            case 4 :
                System.out.println("4.>> Tìm kiếm theo ngày nhập.");
                break ;
            case 5 :
                System.out.println("5.>> Tìm kiếm theo trong khoảng các ngày nhập.");
                break ;
            default:
                System.out.println("Chọn sai rồi. Vui lòng chọn lại!!!");
                break;
        }
        System.out.print("- Quay lại MENU TÌM KIẾM HÀNG HÓA (1:Yes / 0:No): ");
        chose = input.nextInt();
        }while(chose == 1);
    }

    public void menuArrangement(){
        int chose ;
        do{
        System.out.println("=================== MENU SẮP XẾP HÀNG HÓA =====================");
        System.out.println("| 1.>> Sắp xếp hàng hóa tăng dần theo giá nhập.               |");
        System.out.println("| 2.>> Sắp xếp hàng hóa giảm dần theo giá nhập.               |");
        System.out.println("| 3.>> Sắp xếp hàng hóa tăng dần theo ngày nhập.              |");
        System.out.println("| 4.>> Sắp xếp hàng hóa tăng dần theo ngày nhập.              |");
        System.out.println("| 5.>> Sắp xếp hàng hóa tăng dần theo loại và theo ngày nhập. |");
        System.out.println("| 6.>> Sắp xếp hàng hóa giảm dần theo loại và theo ngày nhập. |");
        System.out.println("| 7.>> Sắp xếp hàng hóa tăng dần theo loại và theo giá.       |");
        System.out.println("| 8.>> Sắp xếp hàng hóa giảm dần theo loại và theo giá.       |");
        System.out.println("===============================================================");
        System.out.print("-Nhập vào sự lựa chọn : ");
        chose = input.nextInt() ;
        System.out.println();
        switch (chose) {
            case 1:
                System.out.println("1.>> Sắp xếp hàng hóa tăng dần theo giá nhập. ");
                break;
            case 2 :
                System.out.println("2.>> Sắp xếp hàng hóa giảm dần theo giá nhập.");
                break ;
            case 3 :
                System.out.println("3.>> Sắp xếp hàng hóa tăng dần theo ngày nhập.");
                break ;
            case 4 :
                System.out.println("4.>> Sắp xếp hàng hóa tăng dần theo ngày nhập.");
                break ;
            case 5 :
                System.out.println("5.>> Sắp xếp hàng hóa tăng dần theo loại và theo ngày nhập");
                break ;
            case 6 :
                System.out.println("6.>> Sắp xếp hàng hóa giảm dần theo loại và theo ngày nhập.");
                break ;
            case 7 :
                System.out.println("7.>> Sắp xếp hàng hóa tăng dần theo loại và theo giá.");
                break ;
            case 8 :
                System.out.println("8.>> Sắp xếp hàng hóa giảm dần theo loại và theo giá.");
                break ;
            default:
                System.out.println("Chọn sai rồi. Vui lòng chọn lại!!!");
                break;
        }
        System.out.print("- Quay lại MENU SẮP XẾP HÀNG HÓA (1:Yes / 0:No): ");
        chose = input.nextInt();
        }while(chose == 1);
    }
    
    public void menuStatistics(){
        int chose ;
        do{
        System.out.println("============ MENU THỐNG KÊ HÀNG HÓA ==============");
        System.out.println("|  1.>> Thống kê tổng số lượng hàng hóa.         |");
        System.out.println("|  2.>> Thống kê tổng số lượng nhập kho.         |");
        System.out.println("|  3.>> Thống kê theo số lượng từng loại hàng.   |");
        System.out.println("==================================================");
        System.out.print("-Nhập vào sự lựa chọn : ");
        chose = input.nextInt() ;
        System.out.println();
        switch (chose) {
            case 1:
                System.out.println("1.>> Thống kê tổng số lượng hàng hóa.");
                break;
            case 2 :
                System.out.println("2.>> Thống kê tổng số lượng nhập kho.");
                break ;
            case 3 :
                System.out.println("3.>> Thống kê tổng số lượng từng loại hàng.");
                break ;
            default:
                System.out.println("Chọn sai rồi. Vui lòng chọn lại !!!");
                break;
        }
        System.out.print("- Quay lại MENU THỐNG KÊ HÀNG HÓA (1:Yes / 0:No): ");
        chose = input.nextInt();
        }while (chose ==1);
    }
    
    public void menuPrintList(){
        int chose ;
        do{
            System.out.println("============ MENU IN DANH SÁCH HÀNG HÓA ==============");
            System.out.println("|  1.>> In danh sách tất cả các hàng hóa.            |");
            System.out.println("|  2.>> In danh sách hàng hóa loại Thực phẩm.        |");
            System.out.println("|  3.>> In danh sách hàng hóa loại Sành sứ.          |");
            System.out.println("|  4.>> In danh sách hàng hóa loại Điện máy.         |");
            System.out.println("======================================================");
            System.out.print("-Nhập vào sự lựa chọn : ");
            chose = input.nextInt() ;
            System.out.println();
            switch (chose) {
                case 1 :
                    System.out.println("1.>> In danh sách tất cả các hàng hóa. ");
                    break;
                case 2 :
                    System.out.println("2.>> In danh sách hàng hóa loại Thực phẩm. ");
                    break ;
                case 3 : 
                    System.out.println("3.>> In danh sách hàng hóa loại Sành sứ.");
                    break ;
                case 4 : 
                    System.out.println("4.>> In danh sách hàng hóa loại Điện máy.");
                    break ;
                default:
                    System.out.println("Chọn sai rồi. Vui lòng chọn lại");
                    break;
            }
            System.out.print("- Quay lại MENU IN DANH SÁCH HÀNG HÓA (1:Yes / 0:No): ");
            chose = input.nextInt();
        }while (chose == 1 );
    }
    
}
