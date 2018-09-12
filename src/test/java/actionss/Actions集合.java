package actionss;


import actions.Actions;
import driverss.seleniumdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Actions集合 {
    @Test
    public  void click(){
        seleniumdriver.open("chrome");
        Actions.get("http://baidu.com");
        Actions.sendText(By.id("kw"),"selenium");
        Actions.click(By.id("su"));
        seleniumdriver.quit();
    }
}
