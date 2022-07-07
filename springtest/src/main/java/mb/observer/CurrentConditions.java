package mb.observer;

public class CurrentConditions implements Observer {

    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dispaly();
    }

    private void dispaly() {
        System.out.println("****Today mTemperature:"+temperature+"****");
        System.out.println("****Today mPressure:"+pressure+"****");
        System.out.println("****Today mHumidity:"+humidity+"****");
    }


}
