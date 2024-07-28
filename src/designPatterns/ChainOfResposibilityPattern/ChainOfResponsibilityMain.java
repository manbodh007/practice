package designPatterns.ChainOfResposibilityPattern;

public class ChainOfResponsibilityMain {
	public static void main(String[] args) {
		LogProcessor logger = new InfoLog(new DebugLog(new ErrorLog(null)));
//		Log logger = new InfoLog(new ErrorLog(new DebugLog(null)));

		logger.log("INFO", "this is info message");
		logger.log("ERROR", "this is error message");
		logger.log("DEBUG", "this is debug message");
	}
}
