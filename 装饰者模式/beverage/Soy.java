package beverage;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/12
 * @since 1.0.0
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",beverage.Soy";
    }

    @Override
    public double cost() {
        return 0.14+beverage.cost();
    }
}