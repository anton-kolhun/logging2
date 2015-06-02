package log;

import org.apache.log4j.Logger;

/**
 * Created by akolhun on 25.11.2014.
 */
public class MyLogger extends Logger {

    static {
        System.out.println("init..");
    }

    public MyLogger(String name) {
        super(name);
    }

    @Override
    public void debug(Object o) {
        System.out.println("youuu!");
    }

    public static Logger getLogger(String name) {
        return new MyLogger(name);
    }

}
