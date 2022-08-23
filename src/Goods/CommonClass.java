package Goods;

import Goods.Interface.IHats;
import Goods.Interface.IShirt;
import Goods.Interface.IShoes;
import Goods.Interface.ITrousers;

import java.util.Scanner;

public abstract class CommonClass implements IHats, IShirt, IShoes, ITrousers {
    protected int hats = 50;
    protected int shirts = 50;
    protected int shoes = 50;
    protected int trousers = 50;
    //Nhập
    @Override
    public void addHats(Scanner sc){
        System.out.println("Số lượng mũ cần nhập vào kho là:");
        int numOfHats = Integer.parseInt(sc.nextLine());
        hats += numOfHats;
    }
    @Override
    public void addShirts(Scanner sc){
        System.out.println("Số lượng áo cần nhập vào kho là:");
        int numOfShirts = Integer.parseInt(sc.nextLine());
        shirts += numOfShirts;
    }
    @Override
    public void addShoes(Scanner sc){
        System.out.println("Số lượng giày cần nhập vào kho là:");
        int numOfShoes = Integer.parseInt(sc.nextLine());
        shoes += numOfShoes;
    }

    @Override
    public void addTrouses(Scanner sc){
        System.out.println("Số lượng quần cần nhập vào kho là:");
        int numOfTrouses = Integer.parseInt(sc.nextLine());
        trousers += numOfTrouses;
    }

    // Mua
    @Override
    public void buyHats(Scanner sc){
        System.out.println("Số lượng mũ bạn muốn mua là:");
        int numOfHats = Integer.parseInt(sc.nextLine());
        if (numOfHats > hats){
            System.out.println("Số lượng bạn muốn mua đã vượt quá số sản phẩm trong kho");
        } else {
            hats -= numOfHats;
        }
    }
    @Override
    public void buyShoes(Scanner sc){
        System.out.println("Số lượng giày bạn muốn mua là:");
        int numOfShoes = Integer.parseInt(sc.nextLine());
        if (numOfShoes > shoes){
            System.out.println("Số lượng bạn muốn mua đã vượt quá số sản phẩm trong kho");
        } else {
            shoes -= numOfShoes;
        }
    }
    @Override
    public void buyShirts(Scanner sc){
        System.out.println("Số lượng áo bạn muốn mua là:");
        int numOfShirts = Integer.parseInt(sc.nextLine());
        if (numOfShirts > shirts){
            System.out.println("Số lượng bạn muốn mua đã vượt quá số sản phẩm trong kho");
        } else {
            shirts -= numOfShirts;
        }
    }
    @Override
    public void buyTrouses(Scanner sc){
        System.out.println("Số lượng quần bạn muốn mua là:");
        int numOfTrouses = Integer.parseInt(sc.nextLine());
        if (numOfTrouses > trousers){
            System.out.println("Số lượng bạn muốn mua đã vượt quá số sản phẩm trong kho");
        } else {
            trousers -= numOfTrouses;
        }
    }

    public int getHats() {
        return hats;
    }

    public int getShirts() {
        return shirts;
    }

    public int getShoes() {
        return shoes;
    }

    public int getTrousers() {
        return trousers;
    }
    public abstract void instruction(Scanner sc);
}
