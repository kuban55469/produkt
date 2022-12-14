package classes;

import enums.ProduktMarket;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Market {
    private String name;
    private BigDecimal money;
    private List<ProduktMarket> products;

    public Market(String name, BigDecimal money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public List<ProduktMarket> getProducts() {
        return products;
    }

    public void setProducts(List<ProduktMarket> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nMoney: " + money ;
    }
}