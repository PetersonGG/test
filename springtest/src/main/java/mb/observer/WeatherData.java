package mb.observer;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observer;

    public WeatherData() {
        observer = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observer.contains(o)){
         observer.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        //便利所有的观察者
        for (int i = 0; i < observer.size(); i++) {
            observer.get(i).update(this.temperature,this.pressure,this.humidity);
        }


    }
}
