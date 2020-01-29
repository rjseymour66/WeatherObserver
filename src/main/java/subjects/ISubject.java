package subjects;
import observers.IObserver;

public interface ISubject {


    public void registerObserver(IObserver o);
    public void unregisterObserver(IObserver o);
    public void notifyObservers(double temp);
}
