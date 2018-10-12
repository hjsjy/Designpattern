/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/12
 * @since 1.0.0
 */
public class Mocha extends CondimentDecorator {
     Beverage beverage;
     public Mocha(Beverage beverage){
         this.beverage = beverage;
     }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}