package duck;
/**
 * 策略模式
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck hjsjyDuck = new HjsjyDuck();
        hjsjyDuck.display();
        hjsjyDuck.swim();
        hjsjyDuck.PeformFly();
        hjsjyDuck.PerformQuack();
        hjsjyDuck.setFlybehavior(new FlyNoWay());
        hjsjyDuck.PeformFly();
    }
}