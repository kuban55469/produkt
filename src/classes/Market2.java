package classes;

import enums.ProductMarket2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Market2 {
    private String name;
    private BigDecimal money;
    private List<ProductMarket2> products;

    public Market2(String name, BigDecimal money) {
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

    public List<ProductMarket2> getProducts() {
        return products;
    }

    public void setProducts(List<ProductMarket2> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nMoney: " + money;
    }
}
