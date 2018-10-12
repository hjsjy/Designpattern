/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/12
 * @since 1.0.0
 */
public class HouseBlend extends Beverage {
        public HouseBlend(){
            description = "House Blend Coffee";
        }
    @Override
    public double cost() {
        return 0.89;
    }
}