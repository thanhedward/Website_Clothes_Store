package Account;

import java.util.Scanner;

public class User extends Acount {
    @Override
    public boolean login(String UserName, String PassWord){
        if (UserName.equals("user") && PassWord.equals("user123")){
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
        System.out.println("Vui lòng loại mặt hàng mà bạn muốn mua:\n 1.Mũ\n 2.Áo \n 3.Giày \n 4.Quần");
        int type = Integer.parseInt(sc.nextLine());
        return type;
    }
}
