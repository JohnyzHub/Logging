package com.mylogging.log4j.props.log4Jwithproperties.foo;

import org.apache.log4j.Logger;

public class Log4JInstance {

	private Log4JInstance(){}

	private static class NestedInstance {
		private static final Log4JInstance log4JInstance = new Log4JInstance();
	}

	public static Log4JInstance getInstance() {
		return NestedInstance.log4JInstance;
	}

	public Logger getLogger() {
		return Logger.getLogger(Log4JInstance.class);
	}

}
