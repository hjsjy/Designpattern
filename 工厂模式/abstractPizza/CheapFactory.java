package abstractPizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/25
 * @since 1.0.0
 */
public class CheapFactory implements AbstractPizzaFactory {//具体工厂

    @Override
    public Pizza createPizza() {
        return new CheapPizza();
    }

    @Override
    public Souce createSouce() {
        return new CheapSouce();
    }
}