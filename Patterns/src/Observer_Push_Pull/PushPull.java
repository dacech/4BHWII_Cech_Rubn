package Observer_Push_Pull;

import java.util.ArrayList;
import java.util.List;

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    // PUSH-Variante: Die Werte werden als Parameter an die Observer übergeben
    void updatePush(double temperature, double humidity);
    // PULL-Variante: Die Observer fragen die Werte selbstständig ab, wenn nötig
    void updatePull();
}

class WeatherStation implements Observable {
    private double temperature;
    private double humidity;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // PUSH-Variante: Die Werte werden als Parameter an die Observer übergeben
            observer.updatePush(temperature, humidity);
            // PULL-Variante: Die Observer fragen die Werte selbstständig ab, wenn nötig
            // observer.updatePull();
        }
    }
}

class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void updatePush(double temperature, double humidity) {
        // PUSH-Variante: Die Werte werden als Parameter an die Observer übergeben
        System.out.println(name + " (PUSH): Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
    }

    @Override
    public void updatePull() {
        // PULL-Variante: Die Observer fragen die Werte selbstständig ab, wenn nötig
        // double temperature = weatherStation.getTemperature();
        // double humidity = weatherStation.getHumidity();
        // System.out.println(name + " (PULL): Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
    }
}

class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");
        Display display3 = new Display("Display 3");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.addObserver(display3);

        weatherStation.setMeasurements(25.0, 50.0);

        weatherStation.removeObserver(display2);

        // PULL-Variante: Die Observer fragen die Werte selbstständig ab, wenn nötig
        // display1.updatePull();
    }
}
