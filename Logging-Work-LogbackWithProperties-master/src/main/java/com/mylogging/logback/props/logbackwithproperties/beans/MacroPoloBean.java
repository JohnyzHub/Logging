package com.mylogging.logback.props.logbackwithproperties.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MacroPoloBean {

	private static final Logger logger = LoggerFactory.getLogger(MacroPoloBean.class);

	public void method1() {

		for(int i=0; i<50;i++) {
			logger.debug("This is Macro Debug : " + i);
			logger.info("This is Macro Info : " + i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}

	}
}
