package entity;

import domain.market.Merchant;

public interface Seller {
    String sell(Merchant.Goods goods);
}