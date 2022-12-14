package service;

import classes.Person;
import enums.ProductMarket2;
import service.impl.MarketServiceImpl;
import service.impl.MarketServiceImpl2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface PersonService{
    String createPerson();
    List<Person> getAllPerson();

    String posupkaProduct(MarketServiceImpl marketService, MarketServiceImpl2 marketServiceImpl2);
    void findByName();

}
