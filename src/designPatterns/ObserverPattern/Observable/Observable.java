package designPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import designPatterns.ObserverPattern.Observer.Observer;

public interface Observable {
	List<Observer> observers = new ArrayList<>();
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifyObserver();
	public void setData(int data);
}
