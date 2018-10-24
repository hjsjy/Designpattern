package simplepizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/24
 * @since 1.0.0
 */
public class SimplePizzaTest {
    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza("baolezi");
        pizza.eat();
        pizza = SimplePizzaFactory.createPizza("hualaishi");
        pizza.eat();
    }


}