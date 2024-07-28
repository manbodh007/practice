package designPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import designPatterns.ObserverPattern.Observer.Observer;

public class IphoneObservableImpl implements Observable{
	int currentStock = 0;
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
       observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
       for(Observer observer: observers){
		   observer.update();
	   }
	}

	@Override
	public void setData(int data) {
       if(currentStock == 0){
		   notifyObserver();
	   }
	   currentStock += data;
	}
}
