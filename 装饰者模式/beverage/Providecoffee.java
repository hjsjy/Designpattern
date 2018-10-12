package beverage;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/12
 * @since 1.0.0
 */
public class Providecoffee {//测试类

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"   "+beverage.cost()+"￥");

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription()+"   "+darkRoast.cost()+"￥");

    }
}