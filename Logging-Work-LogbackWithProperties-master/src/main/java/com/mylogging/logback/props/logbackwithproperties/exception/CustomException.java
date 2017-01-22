package com.mylogging.logback.props.logbackwithproperties.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(CustomException.class);

	public CustomException(String msg, int id) {
		super(msg);
		logger.error("Exception - " + msg + " - ID - " + id);
	}


}
