package pizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/23
 * @since 1.0.0
 */
public class BaoleziPizzaStore extends PizzaStore {

    @Override
    protected Pizaa createPizza(String type) {
        if (type.equals("mala")) {

            return new BaoleziMalaPizza();
        }else if(type.equals("zhishi")){
            return new BaoleziZhishiPizza();
        }else {
            return null;
        }
    }
}