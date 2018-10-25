package abstractPizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/25
 * @since 1.0.0
 */
public interface Pizza {//
    void eat();
}
class  ExpensivePizza implements  Pizza{

    @Override
    public void eat() {
        System.out.println("贵的披萨巨好吃！");
    }
}

class CheapPizza implements Pizza {
    @Override
    public void eat() {
        System.out.println("便宜的披萨");
    }
}
