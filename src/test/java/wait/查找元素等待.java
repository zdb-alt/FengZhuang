package wait;

import driverss.seleniumdriver;
import driver.findelement.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/9/8.
 */
public class 查找元素等待 extends  seleniumdriver{
    @Test
    public  void find(){
        seleniumdriver.open("chrome");
        driver.get("file:///D:/demo.html");
        Element.findelement(By.id("wait")).click();
        String text=  Element.findelement(By.id("display")).getText();
        System.out.print(text);

    }
}
