package service.impl;

import classes.Market2;
import enums.ProductMarket2;
import service.MarketService2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MarketServiceImpl2 implements MarketService2 {
    List<ProductMarket2> market2s = new ArrayList<>();
    List<ProductMarket2> productMarket2s = new ArrayList<>(List.of(
            ProductMarket2.BANANA,ProductMarket2.CARROT,ProductMarket2.GREENS,ProductMarket2.CUCUMBER,
            ProductMarket2.PINEAPPLE,ProductMarket2.ORANGE,ProductMarket2.ONION,ProductMarket2.POTATO,
            ProductMarket2.TOMATO
    ));
    Market2 market2 = new Market2("Narodnyi",BigDecimal.valueOf(200000));
    @Override
    public void getAllProducts() {


        System.out.println("~~~~~~~Products~~~~~~~");
        for (ProductMarket2 productMarket2 : productMarket2s) {
            System.out.println(productMarket2 + " -> " + productMarket2.getPrice() + " som");
        }
        market2s.addAll(productMarket2s);

    }

    @Override
    public void getMarket2() {
        System.out.println(market2);
    }
}
