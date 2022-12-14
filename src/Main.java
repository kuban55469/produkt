
import service.impl.MarketServiceImpl;
import service.impl.MarketServiceImpl2;
import service.impl.PersonServiceImpl;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        MarketServiceImpl marketService = new MarketServiceImpl();
        PersonServiceImpl personService = new PersonServiceImpl();
        MarketServiceImpl2 marketServiceImpl2 = new MarketServiceImpl2();

        while (true) {
            System.out.println("""
                    1 -> Вывести всех маркетов.
                    2 -> Вывести все продукты маркета Frunze.
                    3 -> Вывести все продукты маркета Narodnyi.
                    4 -> Создать людей.
                    5 -> Вывести всех людей.
                    6 -> Покупка продуктов.
                    7 -> Найти человека по имени.
                    """);

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    marketService.getMarket();
                    marketServiceImpl2.getMarket2();
                }
                case 2 -> marketService.getAllProducts();
                case 3 -> marketServiceImpl2.getAllProducts();
                case 4 -> System.out.println(personService.createPerson());
                case 5 -> System.out.println(personService.getAllPerson());
                case 6 -> System.out.println(personService.posupkaProduct(marketService,marketServiceImpl2));
                case 7 -> personService.findByName();

            }
        }
    }
}