package com.java.examples.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kartik.patel
 * @since 5/3/2017
 */
public class SLF4JLoggingWithLog4JDemo {
    private final static Logger logger = LoggerFactory.getLogger(SLF4JLoggingWithLog4JDemo.class);
    public static void main(String[] args) {
        logger.info("SLF4J Logging with Log4J");
    }
}
