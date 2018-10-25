package abstractPizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/25
 * @since 1.0.0
 */
public  interface AbstractPizzaFactory {//抽象工厂
   Pizza createPizza();
   Souce createSouce();
}