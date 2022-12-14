package enums;

import java.math.BigDecimal;

public enum ProductMarket2 {
    ORANGE(BigDecimal.valueOf(150)),
    CARROT(BigDecimal.valueOf(70)),
    POTATO(BigDecimal.valueOf(40)),
    TOMATO(BigDecimal.valueOf(200)),
    BANANA(BigDecimal.valueOf(180)),
    PINEAPPLE(BigDecimal.valueOf(500)),
    CUCUMBER(BigDecimal.valueOf(220)),
    ONION(BigDecimal.valueOf(50)),
    GREENS(BigDecimal.valueOf(30))
    ;

    BigDecimal price ;


    ProductMarket2(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
