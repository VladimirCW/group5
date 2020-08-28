package test.java.lesson10;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Del {
    private static Logger logger = LogManager.getLogger(Del.class);

    public static void main(String[] args) {
        logger.trace("TRACE LOG");
        logger.debug("DEBUG LOG");
        logger.info("INFO LOG");
        logger.warn("WARN LOG");
        logger.error("ERROR LOG");
        logger.fatal("FATAL LOG");
    }
}
