package core.Display;

import core.Observable;
import core.Observer;

public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }


}
