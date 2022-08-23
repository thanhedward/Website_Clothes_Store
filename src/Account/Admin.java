package Account;

import java.util.Scanner;

public class Admin extends Acount {
    @Override
    public boolean login(String UserName, String PassWord){
        if (UserName.equals("admin") && PassWord.equals("admin123")){
            System.out.println("Login successful!");
            return true;
        }
        else {
            System.out.println("Login failed!");
            return false;
        }
    }
    @Override
    public int typeOfProduct(Scanner sc){
        System.out.println("Vui lòng loại mặt hàng mà bạn muốn nhập vào kho:\n 1.Mũ\n 2.Áo \n 3.Giày \n 4.Quần");
        int type = Integer.parseInt(sc.nextLine());
        return type;
    }
}
