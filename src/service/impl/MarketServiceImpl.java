package service.impl;

import service.MarketService;
import java.math.BigDecimal;
import java.util.*;

import classes.Market;
import enums.*;


public class MarketServiceImpl  implements MarketService {
    List<ProduktMarket> dd = new ArrayList<>();
    Market market = new Market("Frunze",BigDecimal.valueOf(100000));
    List<ProduktMarket> produktMarkets = new ArrayList<>(List.of(
            ProduktMarket.CHEESE,ProduktMarket.CHOCOLATE,ProduktMarket.BREAD,
            ProduktMarket.MEAT,ProduktMarket.COCA_COLA,ProduktMarket.MILK,
            ProduktMarket.SUGAR,ProduktMarket.WATER
    ));
    @Override
    public void getAllProducts() {
        System.out.println("~~~~~~~Products~~~~~~~");
        for (ProduktMarket produktMarket : produktMarkets) {
            System.out.println(produktMarket + " -> "+ produktMarket.getPrice() + " som");
        }
        dd.addAll(produktMarkets);
    }

    @Override
    public void getMarket() {
        System.out.println(market);
    }
}
