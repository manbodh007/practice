package designPatterns.ObserverPattern.Observer;

import designPatterns.ObserverPattern.Observable.Observable;

public class SmsObserver implements Observer{
	private String mobile;
//	private Observable observable;

	public SmsObserver(String mobile){
		this.mobile = mobile;
//		this.observable = observable;
	}
	@Override
	public void update() {
		sendSms();
	}

	private void sendSms() {
		System.out.println("Sms send to mobile: " + mobile);
	}
}
