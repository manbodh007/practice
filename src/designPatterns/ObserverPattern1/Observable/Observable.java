package designPatterns.ObserverPattern1.Observable;

import java.util.ArrayList;
import java.util.List;

import designPatterns.ObserverPattern1.Observer.Observer;

public interface Observable {
	List<Observer> observers = new ArrayList<>();
	void add(Observer observer);
	void remove(Observer observer);
	void setData(int num);
	int getData();
	void notifyObservers();

}
