package actionss;


import actions.Actionss;
import driverss.seleniumdriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Actions集合 {
    @Test
    public  void click(){
        seleniumdriver.open("chrome");
        Actionss.get("http://baidu.com");
        Actionss.sendText(By.id("kw"),"selenium");
        Actionss.click(By.id("su"));
        seleniumdriver.quit();
    }
    @Test
    //获取文本
    public void gettext(){
         seleniumdriver.open("chrome");
        Actionss.get("http://baidu.com");
        String text= Actionss.gettext(By.name("tj_trnews"));
        System.out.print(text);
        seleniumdriver.quit();
    }
    //获取多个文本
    @Test
    public void gettexts(){
        seleniumdriver.open("chrome");
        Actionss.get("https://baidu.com");
        ArrayList list= Actionss.gettexts(By.xpath(".//*[@id='u1']/a"));
      //  System.out.print(list.get(1));
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        seleniumdriver.quit();

    }
}
