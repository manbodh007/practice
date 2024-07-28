package designPatterns.ObserverPattern.Observer;

import designPatterns.ObserverPattern.Observable.Observable;

public class EmailObserver implements Observer{
	private String email;
//	private Observable observable;

	public EmailObserver(String email){
		this.email = email;
//		this.observable = observable;
	}
	@Override
	public void update() {
		sendEmail();
	}

	private void sendEmail() {
		System.out.println("email send to mobile: " + email);
	}
}
