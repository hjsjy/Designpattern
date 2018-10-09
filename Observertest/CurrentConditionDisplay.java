package Observertest;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class CurrentConditionDisplay implements  Observer,Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition"+temperature+"Humidity"+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
            this.temperature=temperature;
            this.humidity=humidity;
            display();
    }
}