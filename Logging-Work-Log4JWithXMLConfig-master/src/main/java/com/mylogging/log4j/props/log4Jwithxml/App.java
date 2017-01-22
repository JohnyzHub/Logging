package com.mylogging.log4j.props.log4Jwithxml;

import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private final static Logger logger = Logger.getLogger(App.class);

	public static void main( String[] args ) {
		System.out.println( "Hello World!" );

		logger.trace("This is trace");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");

		
		logger.info("From LogManager : ");
		for(Enumeration loggers = LogManager.getCurrentLoggers();loggers.hasMoreElements();) {
			Logger logger1 = (Logger)loggers.nextElement();
			for (Enumeration appenders = logger1.getAllAppenders(); appenders.hasMoreElements();) {
				Appender appender = (Appender)appenders.nextElement();
				logger.info("Appender : " + appender.getName());
			}
		}
		
		logger.info("From Logger : ");
		for(Enumeration apndrs = logger.getAllAppenders(); apndrs.hasMoreElements();) {
			Appender apn = (Appender)apndrs.nextElement();
			logger.info("Appender : " + apn.getName());
		}

	}
}
