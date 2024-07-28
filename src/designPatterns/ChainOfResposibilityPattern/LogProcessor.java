package designPatterns.ChainOfResposibilityPattern;

public class LogProcessor implements Log{
	private final LogProcessor nextLogProcessor;

	public LogProcessor(LogProcessor nextLogProcessor) {
		this.nextLogProcessor = nextLogProcessor;
	}

	@Override
	public void log(String name, String message) {
		if (nextLogProcessor != null) {
			nextLogProcessor.log(name, message);
		}
	}
}
