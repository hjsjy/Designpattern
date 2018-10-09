package Observertest;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/9
 * @since 1.0.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
       CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
       weatherData.setMeasurements(80,68,29.2f);
       weatherData.setMeasurements(90,100,23);

    }
}