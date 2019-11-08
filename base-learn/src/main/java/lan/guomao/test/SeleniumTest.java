package lan.guomao.test;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Languomao on 2018/9/3.
 */
public class SeleniumTest {

    @Ignore("need chrome driver")
    @Test
    public void testSelenium() {
        System.getProperties().setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://huaban.com/");
        WebElement webElement = webDriver.findElement(By.xpath("/html"));
        System.out.println(webElement.getAttribute("outerHTML"));
        webDriver.close();
    }

}
