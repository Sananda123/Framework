package com.hrms.utilities;

import org.apache.log4j.Logger;


public class Log {
	private Logger log = Logger.getLogger(Log.class.getName());
	public static void info(String message) {
		Log.info(message);
	}

}
