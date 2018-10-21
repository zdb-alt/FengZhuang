package log4j.com;

import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/10/21.
 */
public class Log {
    final  static Log4j log=Log4j.getLogg( Log.class);
    @Test
    public  void test(){
        log.info("这是info");
        log.debug("这是debug");
        log.error("这是error");
        log.warn("这是warn");
    }
}


