package Goods;

import java.util.Scanner;

public class Males extends CommonClass{

    @Override
    public void instruction(Scanner sc){
        System.out.println("Vui lòng chọn mặt hàng nam mà bạn muốn kiểm tra số lượng:\n 1.Mũ\n 2.Áo \n 3.Giày \n 4.Quần");
        int type = Integer.parseInt(sc.nextLine());
        switch (type)
        {
            case 1:
                System.out.println("Số mũ còn lại trong kho là: " + getHats());
                break;
            case 2:
                System.out.println("Số áo còn lại trong kho là: " + getShirts());
                break;
            case 3:
                System.out.println("Số giày còn lại trong kho là: " + getShoes());
                break;
            case 4:
                System.out.println("Số quần còn lại trong kho là: " + getTrousers());
                break;
            default:
                System.out.println("Bạn đã nhập số không hợp lệ");
        }
    }
}
