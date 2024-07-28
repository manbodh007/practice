package designPatterns.ChainOfResposibilityPattern;

public class ErrorLog extends LogProcessor {

	public ErrorLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(String name, String message) {
		if (name.equalsIgnoreCase("ERROR")) {
			System.out.println("Error: " + message);
		}else{
			super.log(name, message);
		}
	}
}
