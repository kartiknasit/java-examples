package com.java.examples.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by kartik.patel on 5/2/2017.
 */
public class CommonsLoggingDemo {
    private static Log log = LogFactory.getLog(CommonsLoggingDemo.class);

    public static void main(String[] args) {
        log.info("Let's try commons logging");
    }
}
