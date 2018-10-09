package duck;

/**
 * 鸭子论之实现
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public abstract class Duck {
    Flybehavior flybehavior;
    Quackbehavior quackbehavior;

    public void setQuackbehavior(Quackbehavior quackbehavior) {
        this.quackbehavior = quackbehavior;
    }

    public void setFlybehavior(Flybehavior flybehavior) {
        this.flybehavior = flybehavior;
    }
    public void PeformFly(){
        flybehavior.fly();
    }
    public void PerformQuack(){
        quackbehavior.quack();
    }
    public void swim(){
        System.out.println("我可以游泳！");
    }
    public abstract  void display();
}
