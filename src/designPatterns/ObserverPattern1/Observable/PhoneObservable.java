package designPatterns.ObserverPattern1.Observable;

import designPatterns.ObserverPattern1.Observer.Observer;

public class PhoneObservable implements Observable{
	private Integer quantity;
	public PhoneObservable(){
		quantity = 0;
	}
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
      observers.remove(observer);
	}

	@Override
	public void setData(int num) {
		quantity = quantity + num;
		if (quantity > 0) {
			notifyObservers();
		}
	}

	@Override
	public int getData() {
      return quantity;
	}

	@Override
	public void notifyObservers() {
       for(Observer observer: observers){
		   observer.update();
	   }
	}
}
