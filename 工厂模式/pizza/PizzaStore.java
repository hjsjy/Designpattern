package pizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/21
 * @since 1.0.0
 */
public abstract class PizzaStore {
        public Pizaa orderPizza(String type) {
            Pizaa pizaa;
            pizaa=createPizza(type);
            pizaa.prepare();
            pizaa.bake();
            pizaa.cut();
            pizaa.box();
            return pizaa;
        }

    protected abstract Pizaa createPizza(String type);
}