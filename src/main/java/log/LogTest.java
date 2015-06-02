package log;

import org.apache.log4j.Logger;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.io.File;
import java.net.URL;

public class LogTest {

    static Logger log = Logger.getLogger("myCategory3");
    //static Logger log = Logger.getLogger("log.child3232", new MyLoggerFactory());

    public static void main(String[] args) throws Exception {
        //System.out.println(System.getProperty("log4j.configuration"));
        log.debug("parent");



    }


}
