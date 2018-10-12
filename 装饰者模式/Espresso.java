/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/10
 * @since 1.0.0
 */
public class Espresso extends  Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    }
