import Account.Admin;
import Account.User;
import Goods.Males;
import Goods.Females;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Females females = new Females();
        Males males = new Males();
        Scanner sc = new Scanner(System.in);
        int mode;
        System.out.println("Bạn muốn truy cập dưới tư cách:\n 1:Admin \n 2:User");
        mode = Integer.parseInt(sc.nextLine());
        if (mode == 1){
            adminMode(sc, females, males);
        } else if (mode == 2){
            userMode(sc, females, males);
        } else {
            System.out.println("Bạn đã nhập sai!");
        }
    }
    public static void adminMode(Scanner sc, Females females, Males males){
        System.out.println("  ADMIN MODE");
        Admin admin = new Admin();
        System.out.println("Vui lòng nhập tài khoản và mật khẩu");
        admin.setUsername(sc.nextLine());
        admin.setPassword(sc.nextLine());
        if(admin.login(admin.getUsername(),admin.getPassword())){
            int maleOrFemale = admin.typeOfGoods(sc);
            if (maleOrFemale == 1){
                males.instruction(sc);
                int type = admin.typeOfProduct(sc);
                switch (type){
                    case 1:
                        males.addHats(sc);
                        break;
                    case 2:
                        males.addShirts(sc);
                        break;
                    case 3:
                        males.addShoes(sc);
                        break;
                    case 4:
                        males.addTrouses(sc);
                        break;
                    default:
                        System.out.println("Số bạn nhập không hợp lệ!");
                }
                males.instruction(sc);
            } else {
                females.instruction(sc);
                int type = admin.typeOfProduct(sc);
                switch (type){
                    case 1:
                        females.addHats(sc);
                        break;
                    case 2:
                        females.addShirts(sc);
                        break;
                    case 3:
                        females.addShoes(sc);
                        break;
                    case 4:
                        females.addTrouses(sc);
                        break;
                    default:
                        System.out.println("Số bạn nhập không hợp lệ!");
                }
                females.instruction(sc);
            }
        }
    }

    public static void userMode(Scanner sc, Females females, Males males){
        System.out.println("  USER MODE");
        User user = new User();
        System.out.println("Vui lòng nhập tài khoản và mật khẩu");
        user.setUsername(sc.nextLine());
        user.setPassword(sc.nextLine());
        if(user.login(user.getUsername(),user.getPassword())){
            int maleOrFemale = user.typeOfGoods(sc);
            if (maleOrFemale == 1){
                males.instruction(sc);
                int type = user.typeOfProduct(sc);
                switch (type){
                    case 1:
                        males.buyHats(sc);
                        break;
                    case 2:
                        males.buyShirts(sc);
                        break;
                    case 3:
                        males.buyShoes(sc);
                        break;
                    case 4:
                        males.buyTrouses(sc);
                        break;
                    default:
                        System.out.println("Số bạn nhập không hợp lệ!");
                }
                males.instruction(sc);
            } else {
                females.instruction(sc);
                int type = user.typeOfProduct(sc);
                switch (type){
                    case 1:
                        females.buyHats(sc);
                        break;
                    case 2:
                        females.buyShirts(sc);
                        break;
                    case 3:
                        females.buyShoes(sc);
                        break;
                    case 4:
                        females.buyTrouses(sc);
                        break;
                    default:
                        System.out.println("Số bạn nhập không hợp lệ!");
                }
//                females.instruction(sc);
            }
        }
    }
}
