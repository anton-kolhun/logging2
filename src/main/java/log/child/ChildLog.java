package log.child;


import log.MyLoggerFactory;
import org.apache.log4j.Logger;

public class ChildLog {
  
  static Logger log = Logger.getLogger("log.child.CCCC", new MyLoggerFactory());

  public static void main(String[] args) {
    log.debug("child");
  }

}
