package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.sys_parameters;

public class contect {

    private void contect2web(){
        System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver wd = new ChromeDriver(); //googlechrome
        WebDriverWait ww = new WebDriverWait(wd, Duration.ofSeconds(10));
        wd.get(sys_parameters.login);

        List<WebElement> frames = wd.findElements(By.tagName("frame"));
        List<WebElement> iframes = wd.findElements(By.tagName("iframe"));

        for (int i = 0; i < frames.size(); i++) {
            WebElement frame = frames.get(i);
            System.out.println("Frame " + i + " attributes: " + frame.getAttribute("name"));
        }
        
        for (int i = 0; i < iframes.size(); i++) {
            WebElement iframe = iframes.get(i);
            System.out.println("IFrame " + i + " attributes: " + iframe.getAttribute("name"));
        }
        
        
    }

    public static void main(String[] args) {
        contect start = new contect();
        start.contect2web();
    }
}
