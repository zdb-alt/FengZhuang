import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/10/8.
 */
public class laxia {
    @Test
    public  static  void ceshi() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\XULE\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://192.168.1.83:8080/TKP-Platform/frame/index.jsp");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"layui-layer3\"]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"test1\"]/input[1]")).sendKeys("zhangdb");
        driver.findElement(By.id("txtpwd")).sendKeys("tkp123456");
        driver.findElement(By.id("txtCode")).clear();
        Thread.sleep(6000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("费用申请")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul[1]/li[1]/ul/li[1]/a/span")).click();
        WebElement iframe=driver.findElement(By.className("temp-iframe-list_228003"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
       driver.findElement(By.className("k-primary k-button")).click();



    }

}
