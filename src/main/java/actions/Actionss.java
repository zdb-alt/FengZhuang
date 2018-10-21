package actions;

import driver.findelement.Element;
import driverss.seleniumdriver;
import log4j.com.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Actionss extends seleniumdriver{
    final  static Log4j log=Log4j.getLogg(Actionss.class);
    //打开网址
    public static void get(String url){
        driver.get(url);
        log.info("网址为"+url);
    }
    //点击
    public static void  click(By by){
        Element.findelement(by).click();
        log.info("点击"+by);
    }
    //文本框输入方法
    public static void sendText(By by,String text){
       WebElement ef= Element.findelement(by);
        ef.clear();
        ef.sendKeys(text);
        log.info("文本框定位方式为："+by+"输入了"+text);

    }
    //获取文本
    public static  String gettext(By by){
       String text= Element.findelement(by).getText();
        log.info("文本框类型为："+by);
        return  text;

    }
    //获取多个文本
    public  static ArrayList gettexts(By by){
        ArrayList arrayList =new ArrayList();
        List<WebElement> list =Element.findelements(by);
        for (int i = 0; i <list.size() ; i++) {
           String text= list.get(i).getText();
            arrayList.add(text);
        }
        return arrayList;
    }
    //双击
    public static void  doubleclick(WebDriver driver,By by){
        seleniumdriver.open("chrome");
        Actionss.get("http://baidu.com");
        Actions actions=new Actions(driver);
       WebElement element= Element.findelement(by);
        actions.doubleClick(element).perform();

    }

}
