package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	private static Logger logger = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello World !!!! \n");
		logger.info("This Info Msg");
		logger.error("This is an Error Msg");
		logger.warn("This is Warning Msg");
		logger.fatal("This is Fatal");
		System.out.println("\n Completed !!!!");
	}

}
