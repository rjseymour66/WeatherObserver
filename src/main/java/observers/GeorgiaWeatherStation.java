package observers;

import utility.Forecast;

public class GeorgiaWeatherStation implements IObserver {

    private double temp;
    private Forecast status;

    public GeorgiaWeatherStation(){}

    public void setTemp(double p_temp){
        temp = p_temp;
    }
    public void update(double p_temp){
        setTemp(p_temp);
        setStatus();
    }
    public void setStatus(){
        if (temp > 90)
            status = Forecast.HOT;
        else if (temp < 90 && temp > 32)
            status = Forecast.NICE;
        else
            status = Forecast.FREEZING;
    }
    public String toString(){
        return "GeorgiaWeatherStation{temp=" + temp + ", status=" + status + "}";
    }
}
