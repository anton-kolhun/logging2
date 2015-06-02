package log.appenders;

import com.sun.deploy.util.ReflectionUtil;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.spi.LoggingEvent;

import java.lang.reflect.Field;

/**
 * Created by akolhun on 02.12.2014.
 */
public class MyAppender  extends RollingFileAppender {

    @Override
    public void append(LoggingEvent e){
        String message = "myMessage";
        try {
            Field field = LoggingEvent.class.getDeclaredField("message");
            field.setAccessible(true);
            field.set(e,message);
        } catch (Exception ex) {/*default execution gets applied*/}
        super.append(e);
        //return;
    }
}