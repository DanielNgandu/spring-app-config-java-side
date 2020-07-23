//package com.luv2code.springdemo;
//
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.springframework.stereotype.Component;
//@Component
//public class UseLogger {
//
//	public UseLogger() {
//		// TODO Auto-generated constructor stub
//	}
//	// use the classname for the logger, this way you can refactor
//    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
//
//
//    public void doSomeThingAndLog() {
//        // ... more code
//
//        // now we demo the logging
//
//        // set the LogLevel to Severe, only severe Messages will be written
//        LOGGER.setLevel(Level.SEVERE);
//        LOGGER.severe("Info Log");
//        LOGGER.warning("Info Log");
//        LOGGER.info("Info Log");
//        LOGGER.finest("Really not important");
//
//        // set the LogLevel to Info, severe, warning and info will be written
//        // finest is still not written
//        LOGGER.setLevel(Level.INFO);
//        LOGGER.severe("Info Log");
//        LOGGER.warning("Info Log");
//        LOGGER.info("Info Log");
//        LOGGER.finest("Really not important");
//    }
//
//    public static void main(String[] args) throws IOException {
//        UseLogger tester = new UseLogger();
//        MyLoggerConfig.initLogger();
//        tester.doSomeThingAndLog();
//    }
//
//}
