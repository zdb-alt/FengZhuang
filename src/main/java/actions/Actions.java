package actions;

import driver.findelement.Element;
import driverss.seleniumdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Actions  extends seleniumdriver{
    //打开网址
    public static void get(String url){
        driver.get(url);
    }
    //点击
    public static void  click(By by){
        Element.findelement(by).click();
    }
    //文本框输入方法
    public static void sendText(By by,String text){
       WebElement ef= Element.findelement(by);
        ef.clear();
        ef.sendKeys(text);
    }

}
