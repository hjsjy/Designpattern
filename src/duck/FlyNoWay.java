package duck;

import duck.Flybehavior;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class FlyNoWay implements Flybehavior {

    @Override
    public void fly() {
        System.out.println("不能飞！！！！！！");
    }
}