package beverage;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/10
 * @since 1.0.0
 */
public abstract class Beverage {
    String description = "Unknown description";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}