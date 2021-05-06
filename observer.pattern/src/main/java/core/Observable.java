package core;

public interface Observable {

    //Both of these methods take an Observer as an argument;
    //that is the Observer to be registered or removed
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
