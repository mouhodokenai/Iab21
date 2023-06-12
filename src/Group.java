import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Group implements Subject {
    private String name;
    private Set<Observer> observers;
    private List<String> notifications;

    public Group(String name) {
        this.name = name;
        this.observers = new LinkedHashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notification) {
        for (Observer observer : observers){
            observer.handleEvent(notification);
        }
    }
}
