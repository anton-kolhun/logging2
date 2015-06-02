package log.layout;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Created by akolhun on 02.12.2014.
 */
public class MyLayout extends PatternLayout {

    @Override
    public String format(LoggingEvent event) {

        return super.format(event);
    }
}
