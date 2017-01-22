package com.mylogging.log4j.props.log4Jwithproperties;

import org.apache.log4j.Logger;

import com.mylogging.log4j.props.log4Jwithproperties.foo.Log4JInstance;

public class App {

	private static Logger logger = null;

	public static void main(String[] args) {

		System.out.println("Hello World!");

		logger = Logger.getLogger(App.class);
		logger.trace("This is trace");
		logger.debug("This is debug");
		logger.info("This is Info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");

		new Class1().method1();

		Log4JInstance.getInstance().getLogger().debug("This is from FOO instance : DEBUG");
		Log4JInstance.getInstance().getLogger().info("This is from FOO instance : INFO");

	}

}
