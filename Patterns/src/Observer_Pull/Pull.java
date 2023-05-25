package Observer_Pull;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

interface Display {
    void display();
}

class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}

class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherStation;

    public CurrentConditionsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update() {
        temperature = ((WeatherStation) weatherStation).getTemperature();
        humidity = ((WeatherStation) weatherStation).getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + " degrees Celsius");
        System.out.println("Current humidity: " + humidity + "%");
    }
}

class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherStation);
        CurrentConditionsDisplay display2 = new CurrentConditionsDisplay(weatherStation);

        weatherStation.setMeasurements(20.0f, 60.0f);
        weatherStation.setMeasurements(22.0f, 55.0f);

        weatherStation.removeObserver(display2);

        weatherStation.setMeasurements(24.0f, 50.0f);
    }
}

