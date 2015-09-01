package com.eficid.test.resinio;

import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log = Logger.getLogger(Application.class.getName());
		log.info("##############################");
		log.info("Application begin now!");
		log.info("");
		
		for (;;) {
			log.info(".");
			Thread.currentThread().sleep(1000);
		}
	}

}
