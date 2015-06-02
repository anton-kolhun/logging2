package log;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by akolhun on 25.11.2014.
 */
public class MyLoggerFactory implements LoggerFactory {

    @Override
    public Logger makeNewLoggerInstance(String s) {
        return new MyLogger(s);
    }
}
