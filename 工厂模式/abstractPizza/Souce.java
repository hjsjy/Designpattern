package abstractPizza;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/25
 * @since 1.0.0
 */
public interface Souce {
        void addSouce();
}

class ExpensiveSouce implements Souce {

    @Override
    public void addSouce() {
        System.out.println("贵的酱料");
    }
}
class CheapSouce implements Souce {

    @Override
    public void addSouce() {
        System.out.println("便宜的酱料");
    }
}