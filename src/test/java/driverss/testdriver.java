package driverss;

import demo.seleniumdriver;
import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/9/8.
 */
public class testdriver extends seleniumdriver{
    @Test
    public  static  void open(){
        seleniumdriver.open("firefox",driver);
        seleniumdriver.quit();
    }
}
