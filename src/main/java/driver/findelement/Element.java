package driver.findelement;

import demo.seleniumdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by XULE on 2018/9/8.
 */
public class Element extends seleniumdriver {
    public static WebElement findelement(final By by){
        WebElement element=null;
        try{
            WebDriverWait wait =new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.print("元素查找"+by+"超时！！");
            e.printStackTrace();
        }
        return driver.findElement(by);
    }

}
