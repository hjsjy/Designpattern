package simplepizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/24
 * @since 1.0.0
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("baolezi")) {
            pizza = new BaoleziPizza();
        }else if(type.equals("hualaishi")){
            pizza = new HualaishiPizza();
        }else {
            return null;
        }
        return pizza;
    }
}