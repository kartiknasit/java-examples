package com.java.examples.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a demo for Logging with SLF4J library.
 * We have not provided any Logging Framework like Log4J or Logback
 * so SLF4J does not print any logging information and print
 * warning to provide logging framework.
 *
 * @author kartik.patel
 * @since 5/3/2017
 */
public class SLF4JLoggingDemo {
    private final static Logger logger = LoggerFactory.getLogger(SLF4JLoggingDemo.class);
    public static void main(String[] args) {
        logger.info("Logging with SLF4J without any Logging Framework");
    }
}
