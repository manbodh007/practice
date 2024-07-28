package designPatterns.ObserverPattern1.Observer;

import designPatterns.ObserverPattern1.Observable.PhoneObservable;

public class PhoneObserver implements Observer{
	private PhoneObservable phoneObservable;
	private String name;

	public PhoneObserver(PhoneObservable phoneObservable,String name){
		this.phoneObservable = phoneObservable;
		this.name = name;
	}
	@Override
	public void update() {
		System.out.println("hey "+ name + ",phone is now on stock, hurry up");
		System.out.println("number of iphone: "+ phoneObservable.getData());
	}
}
