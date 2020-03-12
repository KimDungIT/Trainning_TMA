package design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer obj) {
        if(obj==null) throw new NullPointerException("Null observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;
        synchronized (MUTEX) {
            if(!changed) return;
            observerLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observerLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
