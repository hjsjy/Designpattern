package duck;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class HjsjyDuck extends  Duck {
    public HjsjyDuck(){
        flybehavior=new FlyOnSky();
        quackbehavior=new AQuack();
    }
    @Override
    public void display() {
        System.out.println("我是一直会游泳,会飞并且会嘎嘎嘎的鸭子!!!!!!!!!");
    }
}