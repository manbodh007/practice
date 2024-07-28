package designPatterns.ChainOfResposibilityPattern;

public class InfoLog extends LogProcessor {
	public InfoLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(String name, String message) {
		if (name.equalsIgnoreCase("INFO")) {
			System.out.println("Info: " + message);
		} else {
			super.log(name, message);
		}
	}
}
