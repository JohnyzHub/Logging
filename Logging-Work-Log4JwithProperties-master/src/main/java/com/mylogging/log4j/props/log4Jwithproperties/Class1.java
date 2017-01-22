package com.mylogging.log4j.props.log4Jwithproperties;

import org.apache.log4j.Logger;

import com.mylogging.log4j.props.log4Jwithproperties.foo.Log4JInstance;

public class Class1 {

	public void method1() {
		Logger logger = Log4JInstance.getInstance().getLogger();
		logger.debug("This is Debug : " + Class1.class.getSimpleName());
		logger.info("This is Info : " + Class1.class.getSimpleName());
	}

}
