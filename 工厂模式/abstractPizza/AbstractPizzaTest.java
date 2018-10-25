package abstractPizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/25
 * @since 1.0.0
 */
public class AbstractPizzaTest {
    public static void main(String[] args) {
        AbstractPizzaFactory expensiveFactory = new ExpensiveFactory();
        Pizza pizza = expensiveFactory.createPizza();
        pizza.eat();
    }
}