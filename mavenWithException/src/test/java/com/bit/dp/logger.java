package com.bit.dp;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class logger {
	Logger log =Logger.getLogger(logger.class.getName());
	@Test
	public void logM() {
		DOMConfigurator.configure("log4G.xml");
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this message");
		log.trace("report");
		
	}
	public void logM2() {
		//DOMConfigurator.configure("log4jpropertise.xml");
		PropertyConfigurator.configure("log4jpropertise");
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this message");
		log.trace("report");
		
	}

}
