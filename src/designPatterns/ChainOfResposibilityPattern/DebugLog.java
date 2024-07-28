package designPatterns.ChainOfResposibilityPattern;

public class DebugLog extends LogProcessor {
	public DebugLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(String name, String message) {
		if (name.equalsIgnoreCase("DEBUG")) {
			System.out.println("DEBUG: " + message);
		} else {
			super.log(name, message);
		}
	}
}
