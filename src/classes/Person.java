package classes;

import enums.ProduktMarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Person <T>{
    private String name;
    private String phoneNumber;
    private BigDecimal money;
    private List products = new ArrayList<>();

    public Person(String name, String phoneNumber, BigDecimal money) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public List<T> getProducts() {
        return products;
    }

    public void setProducts(List<T> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nMoney: " + money +
                "\nProducts: " + products +
                "\n~~~~~~~~~~~~~~~~~~~~~~";
    }
}
