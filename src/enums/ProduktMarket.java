package enums;

import java.math.BigDecimal;

public enum ProduktMarket {
    MILK(BigDecimal.valueOf(70)),
    BREAD(BigDecimal.valueOf(20)),
    MEAT(BigDecimal.valueOf(500)),
    SUGAR(BigDecimal.valueOf(110)),
    COCA_COLA(BigDecimal.valueOf(80)),
    WATER(BigDecimal.valueOf(30)),
    CHEESE(BigDecimal.valueOf(1000)),
    CHOCOLATE(BigDecimal.valueOf(130))
    ;
    BigDecimal price;

    ProduktMarket(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
