package domain.market;

import entity.Seller;

public class Merchant implements Seller {
    //Метод для продажи
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }
    //enum для товаров
    public enum Goods {
        POTION
    }
}