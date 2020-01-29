package client;

import observers.FloridaWeatherStation;
import observers.GeorgiaWeatherStation;
import subjects.Satellite;

public class App {
    public static void main(String[] args) {
        Satellite doppler = new Satellite();

        FloridaWeatherStation fl = new FloridaWeatherStation();
        GeorgiaWeatherStation ga = new GeorgiaWeatherStation();

        doppler.registerObserver(fl);
        doppler.registerObserver(ga);
        doppler.notifyObservers(95.5);
        doppler.printObservers();
        System.out.println("******************");
        System.out.println(fl.toString());
        System.out.println(ga.toString());
    }

}
