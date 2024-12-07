package com.Logger;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[]args) {
		Logger log =LogManager.getLogger();
		
		log.fatal("This is an fatal");
		log.error("This is an error code");
		log.warn("This is an warn code");
		log.info("This is an info code");
		log.debug("This is an debug code");
		log.trace("This is an trace code");
	}
}
