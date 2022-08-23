package Account;

import java.util.Scanner;

public abstract class Acount {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract boolean login(String UserName, String PassWord);
    public abstract int typeOfProduct(Scanner sc);//Chọn loại mặt hàng để mua/nhập vào
    public int typeOfGoods(Scanner sc){
        System.out.println("Bạn muốn chọn sản phẩm:\n 1:Nam\n 2:Nữ");
        int type = Integer.parseInt(sc.nextLine());
        if (type == 1){
            System.out.println("Bạn đang xem sản phẩm nam!");
            return 1;
        } else if (type == 2){
            System.out.println("Bạn đang xem sản phẩm nữ!");
            return 2;
        } else {
            System.out.println("Bạn đã nhập sai, vui lòng nhập lại!");
            return typeOfGoods(sc);
        }
    }
}
