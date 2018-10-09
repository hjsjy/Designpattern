package Observertest;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserevers() {
        for (Object observer: observers
             ) {
            Observer observer1 = (Observer) observer;
            observer1.update(temperature,humidity,pressure);

        }
    }
    public void measurementsChanged(){
        notifyObserevers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
    //其他方法
}