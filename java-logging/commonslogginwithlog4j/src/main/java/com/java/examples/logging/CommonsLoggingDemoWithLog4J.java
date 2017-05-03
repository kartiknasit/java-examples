package com.java.examples.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by kartik.patel on 5/2/2017.
 */
public class CommonsLoggingDemoWithLog4J {
    private static Log log = LogFactory.getLog(CommonsLoggingDemoWithLog4J.class);

    public static void main(String[] args) {
        log.info("Let's try commons logging using Log4J");
    }
}
