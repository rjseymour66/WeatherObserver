package subjects;

import observers.IObserver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Satellite implements ISubject {

    private ArrayList<IObserver> observers = new ArrayList<>();
    private double temp;

    public Satellite(){
    }
    private void setTemp(int p_temp){
        temp = p_temp;
        notifyObservers(p_temp);
    }

    public void registerObserver(IObserver o){
        observers.add(o);
        System.out.println(o + " was added to the satellite registry.");
    }
    public void unregisterObserver(IObserver o){
        observers.remove(o);
        System.out.println(o + " was removed from the satellite registry.");
    }
    public void notifyObservers(double p_temp){
        for (IObserver o : observers){
            o.update(p_temp);
        }
    }
    public void printObservers(){
        for (IObserver o : observers){
            System.out.println(o);
        }
    }
}
