package pizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/23
 * @since 1.0.0
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore hualaishipizza = new HualaishiPizzaStore();
        PizzaStore baoleziPizza = new BaoleziPizzaStore();
        Pizaa pizaa = hualaishipizza.orderPizza("mala");
        System.out.println("---完成"+pizaa.getName()+"的制作"+"\n");

        pizaa = baoleziPizza.orderPizza("mala");
        System.out.println("---完成"+pizaa.getName()+"的制作");
    }
}