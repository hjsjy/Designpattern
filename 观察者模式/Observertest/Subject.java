package Observertest;


/**
 * Subject接口为可观察者接口
 * @
 */
public interface Subject {
     /**
      * @param o 传入参数为观察者接口实现对象
      */
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserevers();
}