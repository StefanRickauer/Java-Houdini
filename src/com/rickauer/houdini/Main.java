package com.rickauer.houdini;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static String PROGRAM = "Houdini";
	private static String VERSION = "0.02";
	private static String PROGRAM_AND_VERSION = PROGRAM + " " + VERSION;
	
	private static Logger mainLogger = LogManager.getLogger(Main.class.getName());
	
	public static void main(String[] args) {

		mainLogger.info(PROGRAM_AND_VERSION + " starting ...");
		try {
			System.out.println(PROGRAM_AND_VERSION);
			
		} catch (Exception exception) {
			mainLogger.error(exception.getMessage());
			exception.printStackTrace();
		}
	}
	
}
