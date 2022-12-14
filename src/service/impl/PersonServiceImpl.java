package service.impl;

import java.math.BigDecimal;
import java.util.*;

import classes.Market;
import classes.Person;
import enums.*;
import service.MarketService;
import service.PersonService;

public class PersonServiceImpl implements PersonService {

    List<Person> personList = new ArrayList<>();

    @Override
    public String createPerson() {
        System.out.println("Введите имя: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Сколько у вас деньги есть: ");
        BigDecimal bigDecimal = new BigDecimal(new Scanner(System.in).nextInt());
        Person person = new Person(name, phoneNumber, bigDecimal);
        personList.add(person);
        return "Вы успешно создали.";
    }

    @Override
    public List<Person> getAllPerson() {
        return personList;
    }

    @Override
    public String posupkaProduct(MarketServiceImpl marketService, MarketServiceImpl2 marketServiceImpl2) {
        System.out.println("Enter name: ");
        String nsmr = new Scanner(System.in).nextLine();
        for (Person person : personList) {
            if (person.getName().equals(nsmr)) {
                System.out.println("Enter market name: ");
                String name = new Scanner(System.in).nextLine();
                if (marketService.market.getName().equals(name)) {
                    marketService.getAllProducts();
                    System.out.println("Enter product name: ");
                    String productName = new Scanner(System.in).nextLine();
                    for (ProduktMarket product : marketService.produktMarkets) {
                        if (product.name().equals(productName.toUpperCase())) {
                            int p = person.getMoney().subtract(product.getPrice()).intValue();
                            if (p >= 0) {
                                person.getProducts().add(product);
                                person.setMoney(person.getMoney().subtract(product.getPrice()));
                                marketService.market.setMoney(marketService.market.getMoney().add(product.getPrice()));
                            } else {
                                return "Akchanyz jetpeit.";
                            }
                        }
                    }
                } else if (marketServiceImpl2.market2.getName().equals(name)) {
                    marketServiceImpl2.getAllProducts();
                    System.out.println("Enter product name: ");
                    String productName1 = new Scanner(System.in).nextLine();
                    for (ProductMarket2 productMarket2 : marketServiceImpl2.productMarket2s) {
                        if (productMarket2.name().equals(productName1.toUpperCase())) {
                            int p = person.getMoney().subtract(productMarket2.getPrice()).intValue();
                            if (p >= 0) {
                                person.getProducts().add(productMarket2);
                                person.setMoney(person.getMoney().subtract(productMarket2.getPrice()));
                                marketServiceImpl2.market2.setMoney(marketServiceImpl2.market2.getMoney().add(productMarket2.getPrice()));
                            } else {
                                return "Akchanyz jetpeit.";
                            }
                        }
                    }
                }
            } else {
                return "Invalid name.";
            }
        }
        return "Покупка успешно ";
    }

    @Override
    public void findByName() {
        System.out.println("Enter name: ");
        for (Person person : personList) {
            if (person.getName().equals(new Scanner(System.in).nextLine())){
                System.out.println(person);
            }
        }
    }
}
