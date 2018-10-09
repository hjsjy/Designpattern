package duck;



/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class AQuack implements Quackbehavior {

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎！！！！！！！！！");
    }
}