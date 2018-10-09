package Observertest;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserevers();
}