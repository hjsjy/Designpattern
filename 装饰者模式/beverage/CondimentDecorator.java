package beverage;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/12
 * @since 1.0.0
 */
public abstract class CondimentDecorator extends Beverage {//调料抽象类
        @Override
        public abstract String getDescription();
}