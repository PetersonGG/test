package mb.observer;



//接口，让weatherData来实现
public interface Subject {

     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObservers();


}
