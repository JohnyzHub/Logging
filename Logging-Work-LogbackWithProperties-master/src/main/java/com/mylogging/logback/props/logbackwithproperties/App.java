package com.mylogging.logback.props.logbackwithproperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mylogging.logback.props.logbackwithproperties.beans.MacroPoloBean;
import com.mylogging.logback.props.logbackwithproperties.exception.CustomException;

/**
 * Hello world!
 *
 */
public class App {

	private final static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main( String[] args ) {

		System.out.println( "Hello World!" );
		logger.info("This is Info");
		logger.debug("This is debug");

		new MacroPoloBean().method1();
		logger.info("End of App-Macro Info");
		logger.debug("End of App-Macro Debug");

		for (int i = 0; i < 20; i ++) {
			if (i%2 == 0) {
				try {
					throw new CustomException("Custom Exception", i);
				} catch (CustomException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				logger.info("Division : " + i);
			}
		}
	}
}
